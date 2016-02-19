package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utill.DBConnector;

public class LoginDAO {
    private boolean res;
    private Connection con;
    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;

    public  boolean select(String id,String password){
        res = false;

      try{
          con = (Connection)DBConnector.getConnection();
          sql = "select * FROM login WHERE " + "user_id = ? AND password = ? ";
          ps = con.prepareStatement(sql);
          ps.setString(1, id);
          ps.setString(2, password);
          rs = ps.executeQuery();
          if(rs.next()){
              res = true;
          }
      } catch (SQLException e) {
          e.printStackTrace();
      } finally {
          try{
              con.close();
          } catch(SQLException e_2) {
              e_2.printStackTrace();
          }
      }
      return res;
  }
}


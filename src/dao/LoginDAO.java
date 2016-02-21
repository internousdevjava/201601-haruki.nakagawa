package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utill.DBConnector;

/**
* ログインをするためのクラス
* @author H.Nakagawa
* @since 1.0
* @version 1.0
*/
public class LoginDAO {
    private boolean res;
    private ResultSet rs;

    public  boolean select(String id,String password){
        res = false;

      try{
    	  Connection con =DBConnector.getConnection();
    	  String sql = "select * FROM login WHERE " + "id = ? AND password = ? ";
    	  PreparedStatement  ps = con.prepareStatement(sql);
          ps.setString(1, id);
          ps.setString(2, password);
          rs = ps.executeQuery();
          if(rs.next()){
              res = true;
          }
      } catch (SQLException e) {
          e.printStackTrace();
      }
      return res;
  }
}


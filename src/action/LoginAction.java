package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDAO;

public class LoginAction extends ActionSupport implements SessionAware {
    public String id;
    public String password;
    public Map<String, Object>session;

public String execute(){

    LoginDAO dao = new LoginDAO(); //LoginDAOクラスを作成すると波線が消える

    boolean res = dao.select(id,password);

    if(!res){
        return ERROR;
    }

    session.put("id", id );

    return SUCCESS;
}

/**
 * @return id
 */
public String getId() {
    return id;
}

/**
 * @param id セットする id
 */
public void setId(String id) {
    this.id = id;
}

/**
 * @return password
 */
public String getPassword() {
    return password;
}

/**
 * @param password セットする password
 */
public void setPassword(String password) {
    this.password = password;
}

/**
 * @return session
 */
public Map<String, Object> getSession() {
    return session;
}

@Override
public void setSession(Map<String, Object> arg0) {
    // TODO 自動生成されたメソッド・スタブ

}

}



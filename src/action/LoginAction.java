package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDAO;
import dto.LoginDTO;

/**ログインするためのクラス
 * @author H.Nakagawa
 * @version 1.0
 * @since 1.0
 */
public class LoginAction extends ActionSupport implements SessionAware {
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 4835553682142918836L;
	/**
	 * ユーザーID
	 */
	public String id;
	/**
	 * ユーザーpassword
	 */
    public String password;
    /**
	 * ログイン判定のためのセッション
	 */
    public Map<String, Object>session;
   /**
	 * ログイン認証を実行するメソッド
	 *   ログイン成功時SUCCESSを返し、失敗時ERRORを返す
	 */
public String execute(){

    LoginDAO dao = new LoginDAO();

    boolean res = dao.select(id,password);

    if(!res){
        return ERROR;
    }
     LoginDTO dto = new LoginDTO(id,password);


    session.put("id", dto.getId());
System.out.println("t");
    return SUCCESS;
  }
/**
 * ユーザーIDを取得するためのメソッド
 * @return id ユーザーID
 */
	public String getId() {
    return id;
}

/**
 * ユーザーIDを格納するためのメソッド
 * @param id ユーザーID
 */
public void setId(String id) {
    this.id = id;
}

/**
 * パスワードを取得するためのメソッド
 * @return password パスワード
 */
public String getPassword() {
    return password;
}

/**
 * パスワードを格納するためのメソッド
 * @param password パスワード
 */
public void setPassword(String password) {
    this.password = password;
}

/**
 * ログイン判定のセッションを取得するメソッド
 * @return session ログイン判定のセッション
 */
public Map<String, Object> getSession() {
    return session;
}
/**
* ログイン判定のセッションを格納するためのメソッド
* @param session ログイン判定のセッション
*/
public void setSession(Map<String, Object> session) {
	this.session = session;
   }
}





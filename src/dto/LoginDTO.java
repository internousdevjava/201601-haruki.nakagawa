package dto;
/**ログインデータを格納するためのクラス
 * @author H.Nakagawa
 * @version 1.0
 * @since 1.0
 */
public class LoginDTO {
	/**
	 * ユーザーID
	 */
    private String id;
    /**
	 * ユーザーpassword
	 */
    private String password;

    /**IDとpasswordを格納するコンストラクター
   	 *
   	 */
    public LoginDTO(String id, String password){
        this.id = id;
        this.password = password;
    }
    /**
	 * ログインIDを取得するメソッド
	 * @return loginId ログインID
	 */
    public String getId() {
        return id;
    }
    /**
   	 * ログインIDを格納するメソッド
   	 * @param loginId ログインID
   	 */

    public void setId(String id) {
        this.id = id;
    }
    /**
	 * パスワードを取得するメソッド
	 * @return password パスワード
	 */

    public String getPassword() {
        return password;
    }


    /**
	 * パスワードを格納するメソッド
	 * @param password パスワード
	 */
    public void setPassword(String password) {
        this.password = password;
    }


}

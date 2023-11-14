
public class User {
    private  String login;
    private String password;
    public  boolean isAuth;

    public  boolean isAdmin;


    public User(String login, String password, boolean isAdmin) {
        this.login = login;
        this.password= password;
        this.isAdmin = isAdmin;
    }


    public boolean auth (String login, String password){
        isAuth = this.password == password && this.login == login;
        return isAuth;

    }

    public  void  unLogin(){
        this.isAuth = false;
    }

    public  boolean getAuth(){
        return  this.isAuth;
    }
}


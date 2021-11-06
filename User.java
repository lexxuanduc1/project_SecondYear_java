public class User {
    private String UserName;
    private String PassWord;
    private int AccBalance;
    //contructor
    public User(String UserName, String PassWord){
        this.UserName = UserName;
        this.PassWord = PassWord;
        this.AccBalance = 0;
    }
    int getAccBalance(){ return AccBalance; }
    String getUserName(){ return UserName; }
    String getPassWord(){ return PassWord; }
}

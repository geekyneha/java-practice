package day16;

public class AccesModifiers {

    public static void main(String[] args){
        BankAccount myAcc = new BankAccount();
        myAcc.userName= "Neha_Khan123";
        myAcc.setPassword("ycsad6by2w");

        System.out.println("Username: "+ myAcc.userName);

        System.out.println("Password: "+ myAcc.getPassword());
    }
}
class BankAccount{

    public String userName;
    private String password;

    public void setPassword(String pwd){
        this.password= pwd;
    }
    
    String getPassword(){
        return this.password;
    }






}

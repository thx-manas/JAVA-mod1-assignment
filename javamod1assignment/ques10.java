import java.util.Scanner;
class Loginauthent{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String user = "admin";
        String pass = "1234";
        String username;
        String pwd;
        int count = 0;

        while(count < 3){
            System.out.print("Enter username: ");
            username = sc.next();
            System.out.print("Enter password: ");
            pwd = sc.next();

            if(username.equals(user) && pwd.equals(pass)){
                System.out.println("Login Successful");
                break;
            }
            else{
                System.out.println("Wrong username or password");
                count = count + 1;
            }
        }
        if(count == 3){
            System.out.println("Account Locked");
        }
    }
}
import java.util.Scanner ;
class atm {

    public static void main(String[] args){
        int amount, balance, afterbalance;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to be withdrawn: ");
        amount = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the account balance :  ");
        balance = sc2.nextInt();
        afterbalance = balance - amount;

        if(amount % 100 == 0) {
            if(afterbalance > 1000) {
                System.out.println("success");
            } else{
                System.out.println("failure");
            }
        } 
        else{
            System.out.println("failure");
        }
    }
}
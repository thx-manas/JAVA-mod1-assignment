import java.util.Scanner;
class salary{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the basic salary");
        double basic = sc.nextDouble();

        if(basic >= 30000){
            basic = basic + (0.20 * basic) + (0.15 * basic);
        } 
        else{
            basic = basic + ( 0.10*basic ) + (0.08*basic) - ( 0.12*basic);
        }

        System.out.println("Your monthly salary is: " + basic);
        sc.close();
    }
}

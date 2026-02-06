import java.util.Scanner;
class classifiednum{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        if(num >= 0){
            System.out.println("Number is Positive");
        }
        else{
            System.out.println("Number is Negative");
        }
        if(num % 2 == 0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
        if(num % 5 == 0 && num % 7 == 0){
            System.out.println("Number is divisible by both 5 and 7");
        }
        else{
            System.out.println("Number is NOT divisible by both 5 and 7");
        }
    }
}
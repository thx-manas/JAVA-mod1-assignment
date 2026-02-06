import java.util.Scanner;
class ReverseDigit{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int temp;
        int rev = 0;
        int sum = 0;
        int count = 0;
        int digit;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        temp = num;

        while(temp != 0){
            digit = temp % 10;
            rev = rev * 10 + digit;
            sum = sum + digit;
            count = count + 1;
            temp = temp / 10;}

        System.out.println("Reverse = " + rev);
        System.out.println("Sum of digits = " + sum);
        System.out.println("Count of digits = " + count);
    }
}
import java.util.Scanner;
class MaxWithoutComparison{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int diff = a - b;
        int sign = (diff >> 31) & 1;
        int max = a * (1 - sign) + b * sign;

        System.out.println("Maximum: " + max);
    }
}
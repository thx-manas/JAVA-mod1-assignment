import java.util.Scanner;
class QuotientWithoutDivision{

    static int divide(int dividend, int divisor){
        if(divisor == 0){
            System.out.println("Division by zero not allowed");
            return 0;
        }
        boolean negative = (dividend < 0) ^ (divisor < 0);
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int quotient = 0;

        while(dividend >= divisor){
            int temp = divisor;
            int multiple = 1;

            while(dividend >= (temp << 1)){
                temp = temp << 1;
                multiple = multiple << 1;
            }
            dividend = dividend - temp;
            quotient = quotient + multiple;
        }

        if(negative)
            quotient = -quotient;
        return quotient;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        int result = divide(dividend, divisor);
        System.out.println("Quotient = " + result);
        sc.close();
    }
}
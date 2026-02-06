import java.util.Scanner;
class SubtractionWithoutMinus{
    
    static int add(int x, int y){
        while (y != 0){
            int carry = x & y;   
            x = x ^ y;           
            y = carry << 1;      
        }
        return x;
    }
    static int subtract(int a, int b){
        int twosComplement = add(~b, 1);
        return add(a, twosComplement);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int result = subtract(a, b);
        System.out.println("Result: " + result);
    }
}
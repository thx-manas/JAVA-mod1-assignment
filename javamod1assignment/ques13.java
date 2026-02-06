import java.util.Scanner;
class MultiplicationWithoutMultiply{

    static int add(int x, int y){
        while(y != 0){
            int carry = x & y;   
            x = x ^ y;           
            y = carry << 1;      
        }
        return x;
    }
    static int multiply(int a, int b){
        boolean negative = false;   

        if(a < 0){
            a = add(~a, 1);         
            negative = !negative;  
        }
        if(b < 0){
            b = add(~b, 1);
            negative = !negative;
        }
        int result = 0;            

        while(b != 0){

            if((b & 1) == 1){    
                result = add(result, a); 
            }
            a = a << 1;            
            b = b >> 1;            
        }

        if(negative){
            result = add(~result, 1);
        }
        return result;        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = multiply(a, b);
        
        System.out.println("Result: " + result);
    }
}
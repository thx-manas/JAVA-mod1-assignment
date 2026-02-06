import java.util.Scanner;
class Solution{

    static boolean isPowerOfTwo(int n){
        return n>0 && (n & (n-1))==0;
    }        
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        boolean result=isPowerOfTwo(n);
        
        System.out.println("number is power of 2-:"+ result);
    }
}
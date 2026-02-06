import java.util.Scanner;
class Swap{

    static void Swapper(int a,int b){
        System.out.println("numbers before swapping"+a+","+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("numbers after swapping"+a+","+b);
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no :");
        int a=sc.nextInt();
        System.out.println("Enter second no:");
        int b=sc.nextInt();
        Swapper(a,b);
    }
}
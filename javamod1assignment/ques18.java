import java.util.Scanner;
class Bit{

    static int Counter(int n){
        int count=0;
        while(n!=0){
            n=n>>1;
            count++;            
        }
        return count;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int result=Counter(n);
        System.out.println("No of bit in number:"+result);
    }
}
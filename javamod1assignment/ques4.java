import java.util.Scanner;
class calculator{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char op = sc.next().charAt(0);
        int n2 =  sc.nextInt();
        sc.close();
       
        switch(op){
            case '+' -> System.out.println(n+n2);
            case '-' -> System.out.println(n-n2);
            case '*' -> System.out.println(n*n2);
            case '/' -> System.out.println(n/n2);
            case '%' -> System.out.println(n%n2);
            default -> System.out.println("Invalid input");
        }

    }
}
import java.util.Scanner;
class PrimeNumrangechk{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start;
        int end;
        System.out.print("Enter starting number: ");
        start = sc.nextInt();
        System.out.print("Enter ending number: ");
        end = sc.nextInt();

        for(int num = start ; num <= end ; num++){
            if(num <= 1)
                continue;
            int flag = 1;
            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                System.out.print(num + " ");
            }
        }
    }
}
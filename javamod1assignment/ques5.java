import java.util.Scanner ;
class bill{

    public static void main(String[] args){
        double ebill ;
        Scanner sc = new Scanner(System.in);
        double units = sc.nextInt();
        sc.close();

        if(units <= 100){
            ebill = units * 2 ;
        }
        else if(units >= 100 && units <= 200){
            ebill = (100*2) + (units - 100)*3;
        }
        else{
            ebill = (100*2) + ( 100*3 ) + (units - 200)*5 ;
        }
        System.out.println("Your monthly ebill is: " + ebill);
    }
}
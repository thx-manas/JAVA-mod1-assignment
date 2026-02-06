import java.util.Scanner;
class Salary{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double salary;
        salary = sc.nextDouble();
       
        if(salary >= 30000){
            salary = salary + (0.20 * salary) + (0.15 * salary);
        }
        else if(salary >= 20000){
            salary = salary + (0.10 * salary) + (0.08 * salary);
        }
        else{
            salary = salary - (0.12 * salary);
        }
        System.out.println("Net salary = " + salary);
    }
}
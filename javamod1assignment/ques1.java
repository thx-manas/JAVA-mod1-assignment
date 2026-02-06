import java.util.Scanner;

class xyz {

public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double quantity = sc.nextDouble();
        double bill = price * quantity;
        if (bill >= 5000) {
            bill = bill - (1.0 / 10 * bill);
        }
        else if (bill < 5000 && bill >= 2000) {
            bill = bill - (5.0 / 100 * bill);
        }
        else {
            bill = bill + (10.0 / 100 * bill);
        }
        System.out.println("Final price = " + bill);
    }
}
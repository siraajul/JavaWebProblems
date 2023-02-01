package CodesDope.Conditional;

import java.util.Scanner;

public class Quantity_Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();
        if ((quantity*100)>1000) {
            System.out.println("You will get a discount of = " + (.1 * quantity * 100) + " and your total cost is = " + (quantity * 100 - (.1 * quantity * 100)));
        }
        else {
            System.out.println("No Discount !");
        }
    }
}

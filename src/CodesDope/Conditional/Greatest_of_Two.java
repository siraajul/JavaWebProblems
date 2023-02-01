package CodesDope.Conditional;

import java.util.Scanner;

public class Greatest_of_Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int first_number= input.nextInt();
        System.out.print("Enter the second Number: ");
        int second_number=input.nextInt();

        if(first_number>second_number){
            System.out.println(first_number+" is the Greatest among them");
        }
        else {
            System.out.println(second_number+" is the Greatest among them");
        }
    }
}

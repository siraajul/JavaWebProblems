package CodesDope.Conditional;

import java.util.Scanner;

public class Square_Rectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Length: ");
        int length = input.nextInt();
        System.out.print("Enter the Widht: ");
        int widht = input.nextInt();

        if(length==widht){
            System.out.println("Its a Square");
        }
        else {
            System.out.println("Its a Rectangle");
        }
    }
}

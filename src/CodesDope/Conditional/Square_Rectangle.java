package CodesDope.Conditional;

import java.util.Scanner;

public class Square_Rectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Length: ");
        int length = input.nextInt();
        System.out.print("Enter the Width: ");
        int width = input.nextInt();

        if(length==width){
            System.out.println("Its a Square");
        }
        else {
            System.out.println("Its a Rectangle");
        }
    }
}

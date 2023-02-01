package CodesDope.Conditional;

import java.util.Scanner;

public class Absolute_Value {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Value: ");
        int value = input.nextInt();
        int absolute_value= (-1*value);

        if(value<0){
            System.out.println(absolute_value);
        }
        else {
            System.out.println(value);
        }
    }
}

package CodesDope.Conditional;

import java.util.Scanner;

public class Salary_Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Salary: ");
        int salary = input.nextInt();
        System.out.print("Enter Your Service Year: ");
        int year = input.nextInt();
        double bonus = salary*0.05;

        if(year>=5){
            System.out.println("Your Bonus is: "+bonus);
        }
        else{
            System.out.println("Sorry ! You Have no Bonus ");
        }
    }
}

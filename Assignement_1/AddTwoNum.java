package Assignement_1;
import java.util.Scanner;

public class AddTwoNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Result :- " + num + num2);
        sc.close();
    }
}
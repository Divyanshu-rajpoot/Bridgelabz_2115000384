package Assignement_1;
import java.util.Scanner;

public class powercalcalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int base = sc.nextInt();
        System.out.println("Enter the exponent");
        int exponent = sc.nextInt();
        double power = Math.pow(base, exponent);
        System.out.println("Power is :- " + power);
        sc.close();
    }
}
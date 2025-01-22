package Assignement_1;
import java.util.Scanner;

public class kilometertoMiles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in Kilometers");
        double Kilometers = sc.nextInt();
        double miles = Kilometers * 0.621371;
        System.out.println("Distance in Miles is :- " + miles);
        sc.close();
    }
}
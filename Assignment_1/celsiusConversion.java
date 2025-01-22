package Assignment_1;
import java.util.Scanner;

public class celsiusConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the celsius");
        double celsius = sc.nextDouble();
        double Fahrenheit = ( celsius * 9/5 ) + 32;
        System.out.println("Fahrenheit :- " + Fahrenheit);
        sc.close();
    }
}
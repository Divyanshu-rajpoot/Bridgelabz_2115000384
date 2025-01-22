package Assignement_1;
import java.util.Scanner;

public class perimeter {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the width");
        int width = sc.nextInt();
        int perimeter = 2 * (length + width);
        System.out.println("periment is :- " + perimeter);
        sc.close();
    }
}
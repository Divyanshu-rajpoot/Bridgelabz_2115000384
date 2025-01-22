package Assignment_1;
import java.util.Scanner;

public class Areaofcircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius");
        int radius = sc.nextInt();
        double area = Math.PI * radius*radius;
        System.out.println("Area :- "+area);
        sc.close();
    }
}
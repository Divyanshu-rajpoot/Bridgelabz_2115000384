package Assignment_1;
import java.util.Scanner;

public class volumeofcylinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        System.out.println("Enter the height");
        int height = sc.nextInt();
        double volume = Math.PI * height * radius * radius;
        System.out.println("volume is " + volume);
        sc.close();
    }
}
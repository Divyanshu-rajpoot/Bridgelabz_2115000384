import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double base = sc.nextDouble();
        System.out.println("The Area of Triangle is " + (base * height)/2);

        sc.close();
    }
}

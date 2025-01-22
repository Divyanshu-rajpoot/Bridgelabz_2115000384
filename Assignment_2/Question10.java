import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heightInCm = sc.nextDouble();
        double heightInInches = heightInCm / 2.54;
        System.out.println("Your height in cm is " + heightInCm + " while in Feet is " + heightInInches/12 + " and inches is " + heightInInches);
        sc.close();
    }
}

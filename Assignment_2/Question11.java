import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double Addition= num1 + num2;
        double Subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        System.out.println("The Addition , Subtraction , multiplication and division of value of 2 numbers " + num1 + " and " + num2 + " is "+ Addition +" , " + Subtraction +" , " + multiplication + " , "+ division
        );
        sc.close();
    }
}

import java.util.Scanner;

public class AverageofThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num = sc.nextInt();
        System.out.println("Enter the Second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third number");
        int num3 = sc.nextInt();
        double average = (num + num2 + num3 ) / 3;
        System.out.println("Average of three numbers is :- " + average);
        sc.close();
    }
}
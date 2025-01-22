import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        System.out.println("The total miles is " + (km * 0.621) + " mile for the given " + km + " km");
        sc.close();
    }
}
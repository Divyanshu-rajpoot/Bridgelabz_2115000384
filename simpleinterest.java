import java.util.Scanner;

public class simpleinterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle");
        int principle = sc.nextInt();
        System.out.println("Enter the Rate");
        int Rate = sc.nextInt();
        System.out.println("Enter the Time");
        int Time = sc.nextInt();
        double simpleinterest = (principle * Rate * Time) / 100;
        System.out.println("SimpleInterest : - " + simpleinterest);
        sc.close();
    }
}
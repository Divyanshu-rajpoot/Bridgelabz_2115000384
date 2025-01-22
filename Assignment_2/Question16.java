import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        System.out.println("Possible no. of handshakes " + (double)(numOfStudents * (numOfStudents-1)/2));
        sc.close();
    }
}

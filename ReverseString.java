import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        System.out.println("Enter the string :- " );
        str.append(sc.nextLine());
        System.out.println("Original String:- " + str);
        str.reverse();
        System.out.println("Reversed String:- " + str);
        sc.close();
    }
}
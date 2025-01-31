import java.util.Scanner;

public class Remove_character{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = sc.nextLine();

        System.out.println("Enter the character to remove:");
        char charToRemove = sc.next().charAt(0);

        String modifiedString = new String();

        for (char ch : input.toCharArray()) {
            if (ch != charToRemove) {
                modifiedString+=ch;
            }
        }

        System.out.println("Modified String: " + modifiedString);
        sc.close();

    }
}

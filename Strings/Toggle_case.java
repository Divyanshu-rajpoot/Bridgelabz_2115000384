import java.util.Scanner;

public class Toggle_case {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter a string:");
        String input = sc.nextLine();
       
        String toggledString = new String();

       
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggledString+=Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                toggledString+=Character.toUpperCase(ch);
            } else {
                toggledString+=(ch);
            }
        }

        System.out.println("Toggled case string: " + toggledString);
        sc.close();
    }
}

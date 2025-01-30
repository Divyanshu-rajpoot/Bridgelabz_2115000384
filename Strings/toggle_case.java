import java.util.Scanner;

public class toggle_case {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String toggleString = "";

        
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggleString += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                toggleString+= Character.toUpperCase(ch);
            } else {
                toggleString += ch; 
            }
        }

        System.out.println("Toggled case string: " + toggleString);
        sc.close();
    }    
}

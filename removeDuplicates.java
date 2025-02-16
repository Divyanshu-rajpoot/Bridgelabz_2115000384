import java.util.HashSet;
import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        System.out.println("Enter the String");
        String temp = sc.nextLine();

        for (int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                str.append(ch);
            }
        }
        System.out.println("String without repeated character:- "+str);
        sc.close();
    }
}

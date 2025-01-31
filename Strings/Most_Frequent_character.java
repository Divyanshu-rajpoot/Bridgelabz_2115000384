import java.util.Scanner;

public class Most_Frequent_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        int[] maparray = new int[26];
        int maxcount = 0;
        char mostFrequent = ' ';
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            maparray[ch-'a']++;
        }

        for (int i = 0; i < maparray.length; i++) {
            if (maparray[i] > maxcount ) {
                maxcount = maparray[i];
                mostFrequent = (char)(i+'a');
            }
        }
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
        sc.close();
    }
}

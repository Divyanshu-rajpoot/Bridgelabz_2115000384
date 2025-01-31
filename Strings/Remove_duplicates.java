import java.util.*;

public class Remove_duplicates{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String: - ");
        String str = sc.nextLine();
        String modifiesString="";

        int[] chararray = new int[26];
        for (int i = 0; i < str.length(); i++) {
            chararray[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < chararray.length; i++) {
            if (chararray[i] >= 1) {
                modifiesString += (char)(i+'a');
            }
        }

        System.out.println("After Removing Duplicates :- " + modifiesString);
        sc.close();
    }
}
public class concatStrings {
    public static void main(String[] args) {
        //array of strings
        String[] arr = {"This" , "World" , "is" , "Beautiful"};

        StringBuffer str = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i] + " ");
        }

        System.out.println("String after adding:- " + str);
    }
}

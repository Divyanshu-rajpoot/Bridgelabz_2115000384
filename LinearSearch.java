public class LinearSearch {
    public static void main(String[] args) {
        String[] sentences = {
            "The ",
            "Java is fun.",
            "I love problems.",
            "Linear search"
        };

        String word = "Java";

        String result = findSentenceWithWord(sentences, word);

        System.out.println(result);
    }

    public static String findSentenceWithWord(String[] sentences, String word) {
       for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; 
            }
        }
        return "Not Found";
    }
}

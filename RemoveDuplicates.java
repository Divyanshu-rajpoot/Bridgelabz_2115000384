import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (Integer item : list) {
            if (seen.add(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> outputList = removeDuplicates(inputList);
        System.out.println(outputList);
    }
}

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class slidingWindowMaximum {

    public static int[] maximum(int[] arr , int k){
        Deque<Integer> deque = new LinkedList<>();
        int arraysize = (arr.length - k ) + 1;  //calculate the size of the array
        int[] array = new int[arraysize];
        int ptr = 0;

        for(int i = 0 ;i< arr.length ;i++){

            int num = arr[i];

            while (!deque.isEmpty() && deque.getLast() < num  ) {
                deque.pollFirst();
            }
            deque.addLast(arr[i]);
            if ( i >= k && arr[i - k] == deque.getFirst() ) {
                deque.pollFirst();
            }

            if (i >= k-1) {
                array[ptr++] = deque.pollFirst();
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,-1,-3,4}; 
        int k = 3; //window size 
        System.out.println(Arrays.toString(maximum(arr, k)));
    }
}

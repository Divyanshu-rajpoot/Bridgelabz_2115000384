import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args) {
        int[] arr = {1,2,6,5,4,9};
        int target = 13;
        System.out.println(Arrays.toString(twoSum(arr, target)));

    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int remaining = target - value;
            if(map.containsKey(remaining)){
                return new int[]{ map.get(remaining ) , i};

            }
            map.put(nums[i] , i);
        }
        return new int[]{-1, -1};
    }
}

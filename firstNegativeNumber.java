public class firstNegativeNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,-1,24,3,-3,14};
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("No negative Number found");
        }
        else{
            System.out.println("The negative number is a position:- " + idx);
        }
    }
}

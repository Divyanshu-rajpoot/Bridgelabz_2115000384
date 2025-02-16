public class SearchIn2DSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
        };

        int target = 5;

        boolean result = searchMatrix(matrix, target);
        System.out.println("Target found: " + result);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false; 
        }

        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int left = 0;
        int right = numRows * numCols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int row = mid / numCols;
            int col = mid % numCols;

            if (matrix[row][col] == target) {
                return true; 
            } else if (matrix[row][col] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return false;
    }
}

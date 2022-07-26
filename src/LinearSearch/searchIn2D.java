package LinearSearch;
import java.util.Arrays;

public class searchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {22,3,14},
                {55,66,77,88,99},
                {22,33,76,54,32},
                {31,41,56,81,98}
        };
        int target = 76;
//        int[] ans = search2D(arr,target);
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}

















package LinearSearch;

public class Max {
    public static void main(String[] args) {
        int[] arr = {33,44,53,13,63,72};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}

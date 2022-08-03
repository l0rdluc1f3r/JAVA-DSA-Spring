package LinearSearch;

public class Min {
    public static void main(String[] args) {
        int[] arr = {22,44,56,4,43,64};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++)   {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}

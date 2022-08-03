package LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] nums = {22,213,24,32,42,52,42,3,-1,3};
        int target = 42;
        System.out.println(linearSearch(nums,target));
}
static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index= 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}

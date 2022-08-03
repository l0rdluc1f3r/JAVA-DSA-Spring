package LinearSearch;

public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {2,42,424,25,35,352,52,343};
        int target = 35;
        System.out.println(linearSearch(arr,target,1,6));
    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for (int index = start; index <= end ; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}

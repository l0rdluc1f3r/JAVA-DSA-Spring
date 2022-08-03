package BinarySearch;

public class orderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {19,18,16,13,12,11,8,5,3,1,0,-4,-7,-8};
        int[] arr = {-12,-8,-4,0,3,6,8,9,13,16,18,19};
        // we can use des order also
        int target = 13;
        System.out.println(orderAgnosticBS(arr,target));

    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
















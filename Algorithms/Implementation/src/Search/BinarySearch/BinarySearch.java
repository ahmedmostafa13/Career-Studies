package Search.BinarySearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int mid;
        while(low <= high){
            mid =  (low+high)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid] > target) {
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return -1;
    }
}

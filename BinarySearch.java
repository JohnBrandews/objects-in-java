public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {11, 12,22,25, 34,64,90};
        int target = 22;
        int index = binarySearch(arr, target);
        if(index != -1) {
            System.out.println("element" + target + "found at index  " + index);
        }
        else{
            System.out.println("element" + target + "not found in the array");
        }
    }
    static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <=high){
            int mid = (low + high) / 2;
            // check if target is presentt
            if(arr[mid] == target){
                return mid;
            }
            // if target greater ignore left half
            if(arr[mid] < target){
                low = mid + 1;
            }
            // if target smaller  ignore right half
            else{
                high = mid - 1;
            }
        }
        // if element not present
        return -1;
    }
}

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {64,34,25,12,22,11,90};
        int target = 22;
        int index = linearSearch(arr, target);
        if(index != -1) {
            System.out.println("element" + target + "found at index " + index);
        }
        else{
            System.out.println("element" + target + "not found in the array");
        }
    }
    //function to perform a linear search
    static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;//element found
            }
        }
        return -1;//element not found
    }
}

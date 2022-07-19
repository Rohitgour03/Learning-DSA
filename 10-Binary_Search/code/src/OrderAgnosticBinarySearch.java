public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {36, 33, 31, 25, 22, 18, 16, 11, 9, 8, 5, 2, 0, -5, -23};
        int target = 9;

        System.out.println(OrderAgnosticBinary(arr, target));
    }

    static int OrderAgnosticBinary(int[] arr, int target){

        int start = 0, end = arr.length - 1;
        boolean isAsc = arr[0] < arr[arr.length - 1];

        while(start <= end){
            // Finding the middle element
            int mid = start + (end - start)/2;

            // Checking if the middle element is a target element, if so then returning it.
            if(arr[mid] == target){
                return mid;
            }

            // Deciding in which part of the array to search for an element depending upon the order of array (ascending or descending)
            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}

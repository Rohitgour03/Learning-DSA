public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9, 11, 15, 35, 48, 56};
        int target = 35;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){

        int start = 0, end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start) + 1;
            start = newStart;
        }

        return binarySearch(arr, target);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else if(target < arr[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }

}

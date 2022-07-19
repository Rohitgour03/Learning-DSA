public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9, 11, 15, 35, 48, 56};
        int target = 36;

        System.out.println(binarySearch(arr, target));
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
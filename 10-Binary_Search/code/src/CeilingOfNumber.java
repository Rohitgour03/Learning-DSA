public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9, 11, 15, 35, 48, 56};
        int target = 8;

        System.out.println(Ceiling(arr, target));
    }

    // return the index of the smallest number >= target
    static int Ceiling(int[] arr, int target){

        // but what if the target is greater than the greatest number in the array, then return -1
        if(target > arr[arr.length - 1]){
            return -1;
        }

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

        return start;
    }
}

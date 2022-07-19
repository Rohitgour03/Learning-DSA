public class PeakOfMountainArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 9, 11, 15, 35, 48, 56};
        System.out.println(binarySearch(arr));
    }

    static int binarySearch(int[] arr){
        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            } else if( arr[mid] > arr[mid-1] ){
                end = mid - 1;
            } else if( arr[mid] < arr[mid-1] ){
                start = mid + 1;
            }
        }

        return -1;
    }
}
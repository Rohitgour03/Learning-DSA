public class Main {
    public static void main(String[] args) {
        int[] nums = {1,5,7,9,-1,0,4,35,78};
        int target = 0;
        int answer = linearSearch(nums, target);
        System.out.println(answer);
    }

    // Searching for an element in an array if found return the index and if not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        // Running a loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
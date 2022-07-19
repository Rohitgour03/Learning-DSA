import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 3, 2, 1};
        int ans = missingNumber(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(ans);
    }

    public static int missingNumber(int[] nums) {
        int i = 0, N = nums.length;
        while(i < N){

            int correct = nums[i];
            // if number is N skip it and if it also not equal to that index then swap it.
            if(nums[i] < N && nums[i] != i){
                swap(nums, i, correct);
            } else{
                i++;
            }
        }

        // Searching for the missing number
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j){
                return j;
            }
        }

        return N;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}

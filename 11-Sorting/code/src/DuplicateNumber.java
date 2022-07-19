public class DuplicateNumber {
    public static void main(String[] args) {

    }

    static int duplicateNumber(int[] nums){
        int i = 0, N = nums.length;
        while(i < N){
            if(nums[i] != (i+1)){
                int correctIndex = nums[i] - 1;
                // if number is N skip it and if it also not equal to that index then swap it.
                if(nums[i] != nums[correctIndex] ){
                    swap(nums, i, correctIndex);
                } else{
                    return nums[i];
                }
            } else{
                i++;
            }
        }

        return -1;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}

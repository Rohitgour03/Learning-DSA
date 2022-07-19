import java.util.List;
import java.util.ArrayList;

public class FindAllDuplicates {
        public List<Integer> findDuplicates(int[] nums) {
            int i = 0, N = nums.length;
            while(i < N){
                    int correctIndex = nums[i] - 1;
                    // if number is N skip it and if it also not equal to that index then swap it.
                    if(nums[i] != nums[correctIndex] ){
                        swap(nums, i, correctIndex);
                    } else{
                        i++;
                    }
            }

            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                if(nums[index] != index + 1){
                    ans.add(nums[index]);
                }
            }

            return ans;
        }

    static void swap(int[] arr, int first, int second){
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first] = temp;
    }
}

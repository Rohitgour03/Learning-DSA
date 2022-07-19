import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 1, 5, 3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != (i + 1)) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else{
                i++;
            }
        }
    }
}
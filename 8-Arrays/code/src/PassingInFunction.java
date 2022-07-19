import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] numbs = {1,2,4,6};
        change(numbs);
        System.out.println(Arrays.toString(numbs));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}

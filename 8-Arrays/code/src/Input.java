import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] arr = new int[5];

        // Input using the for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]  = in.nextInt();
//        }
//
//        for (int j : arr) {
//            System.out.println(j);
//        }

        // Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        str[3] = "Gaddhu";

        // Outputting the array elements
        System.out.println(Arrays.toString(str));


    }
}

import java.util.Arrays;
import java.util.Scanner;

public class multidimentionalArray {
    public static void main(String[] args) {
        // Declaring and initializing the 2D array
        //int[][] nums = new int[3][];

        Scanner in = new Scanner(System.in);

//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

        int[][] arr = new int[3][2];

        for (int row = 0; row < arr.length; row++) {
            // for column of a row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

    }
}

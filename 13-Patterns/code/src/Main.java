public class Main {
    public static void main(String[] args) {
        pattern28(5);
    }

    static void pattern28(int n){
        // for each row
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row > n ? 2*n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            // for every row, run the col
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        // for each row
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        // for each row
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        // for each row
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= (n - row + 1); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        // for each row
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        // for each row
        for (int row = 1; row <= 2*n; row++) {
            int totalColsInRow = row > n ? 2*n - row: row;
            // for every row, run the col
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



}
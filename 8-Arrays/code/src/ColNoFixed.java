public class ColNoFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };

        for (int[] rows : arr) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

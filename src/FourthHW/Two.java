package FourthHW;

public class Two {
        public static void main(String[] args) {
            int size = 5; // Example size
            printMatrix("Matrix 1", matrix1(size));
            printMatrix("Matrix 2", matrix2(size));
            printMatrix("Matrix 3", matrix3(size));
            printMatrix("Matrix 4", matrix4(size));
        }
        private static void printMatrix(String title, int[][] matrix) {
            System.out.println(title + ":");
            for (int[] row : matrix) {
                for (int value : row) {
                    System.out.print(value + "\t");
                }
                System.out.println();
            }
        }
        public static int[][] matrix1(int size) {
            int[][] matrix = new int[size][size];
            for (int col = 0; col < size; col++) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = row + col * size + 1;
                }
            }
            return matrix;
        }
        public static int[][] matrix2(int size) {
            int[][] matrix = new int[size][size];
            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    matrix[row][col] = row * size + col + 1;
                }
            }
            return matrix;
        }
        public static int[][] matrix3(int size) {
            int[][] matrix = new int[size][size];
            for (int col = 0; col < size; col++) {
                for (int row = 0; row < size; row++) {
                    if (col % 2 == 0) {
                        matrix[row][col] = row * size + col + 1;
                    } else {
                        matrix[size - row - 1][col] = row * size + col + 1;
                    }
                }
            }
            return matrix;
        }
        public static int[][] matrix4(int size) {
            int[][] matrix = new int[size][size];
            int value = 1;
            int top = 0, bottom = size - 1, left = 0, right = size - 1;

            while (value <= size * size) {
                for (int i = left; i <= right; i++) matrix[top][i] = value++;
                top++;
                for (int i = top; i <= bottom; i++) matrix[i][right] = value++;
                right--;
                if (top <= bottom) {
                    for (int i = right; i >= left; i--) matrix[bottom][i] = value++;
                    bottom--;
                }
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) matrix[i][left] = value++;
                    left++;
                }
            }
            return matrix;
        }
    }

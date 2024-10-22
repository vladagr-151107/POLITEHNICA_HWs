package ThirdHW;

public class MatrixOperations {
    public static double[][] matrixAdd(double[][] m1, double[][] m2) {
        int rows = m1.length;
        int cols = m1[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }
    public static double matrixDiagonalSum(double[][] m1) {
        double diagonalSum = 0.0;
        for (int i = 0; i < m1.length; i++) {
            diagonalSum += m1[i][i];
        }
        return diagonalSum;
    }
    public static void main(String[] args) {
        double[][] matrix1 = {{2, 5, 3}, {8, 10, 4}, {1, 5, 7}};
        double[][] matrix2 = {{9, 12, 7}, {2, 5, 9}, {4, 3, 8}};
        double[][] sumMatrix = matrixAdd(matrix1, matrix2);
        System.out.println("Sum of the matrices:");
        for (double[] row : sumMatrix) {
            System.out.println(java.util.Arrays.toString(row));
        }
        double diagonalSum = matrixDiagonalSum(matrix1);
        System.out.println("Sum of the diagonal elements of matrix1: " + diagonalSum);
    }
}

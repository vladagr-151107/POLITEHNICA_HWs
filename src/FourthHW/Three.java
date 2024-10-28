package FourthHW;

public class Three {

        public static int sumMainDiagonal(int[][] m) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < m.length; i++) {
                sum1 += m[i][i];
            }
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j <= i; j++) {
                    sum2 += m[i][j]; // Add the elements under and including the diagonal
                }
            }
            System.out.println(sum1);
            System.out.println(sum2);
            return 0;
        }

        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            System.out.println("Sum of the main diagonal: " + sumMainDiagonal(matrix));
        }
    }

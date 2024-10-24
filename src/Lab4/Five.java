package Lab4;
import java.util.Random;

public class Five {
    public static void main(String[] args) {
        int[][] numbers = new int[5][7];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                numbers[i][j] = random.nextInt(1, 100);
            }
        }
        System.out.println("Initial Random Array Elements:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        int overallMaximum = Integer.MIN_VALUE;
        for(int i = 0; i < 5; i++){
            int rowMaximum = Integer.MIN_VALUE;
            for(int j = 0; j < 7; j++){
                System.out.println(numbers[i][j] + " ");
                rowMaximum = Math.max(rowMaximum, numbers[i][j]);
                overallMaximum = Math.max(overallMaximum, numbers[i][j]);
            }
            System.out.println();
            System.out.println("Maximum in row " + (i + 1) + ": " + rowMaximum);
        }
        System.out.println("Maximum in the entire matrix: " + overallMaximum);
    }
}


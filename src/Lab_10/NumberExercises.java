package Lab_10;
import java.io.*;
import java.util.*;
//Exercise 1
public class NumberExercises {
    public static void checkNumbers(String inputFile) {
        try (Scanner scanner = new Scanner(new File(inputFile))) {
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            double sum = 0;
            int count = 0;

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                largest = Math.max(largest, num);
                smallest = Math.min(smallest, num);
                sum += num;
                count++;
            }

            if (count > 0) {
                System.out.println("Largest: " + largest);
                System.out.println("Smallest: " + smallest);
                System.out.println("Average: " + (sum / count));
            } else {
                System.out.println("The file does not contain any numbers.");
            }
        } catch (Exception e) { //Exception e used to handle errors
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
    //Exercise 2
    public static void sortNumbers(String inputFile, String outputFile) {
        try (Scanner scanner = new Scanner(new File(inputFile));
             PrintWriter writer = new PrintWriter(new File(outputFile))) {
            int[] numbers = new int[100];
            int count = 0;

            while (scanner.hasNextInt() && count < numbers.length) {
                numbers[count++] = scanner.nextInt();
            }
            Arrays.sort(numbers, 0, count);

            for (int i = 0; i < count; i++) {
                writer.println(numbers[i]);
            }
            System.out.println("Numbers sorted and written to " + outputFile);
        } catch (Exception e) {
            System.out.println("Error processing the file: " + e.getMessage());
        }
    }
    public static void main(String[] args){
        String numbersFile = "C:\\Users\\Vlada_Pc\\IdeaProjects\\POLITEHNICA_HWs\\src\\Lab_10\\numbers.txt";
        String sortFile = "C:\\Users\\Vlada_Pc\\IdeaProjects\\POLITEHNICA_HWs\\src\\Lab_10\\sort.txt";
        checkNumbers(numbersFile);
        sortNumbers(numbersFile, sortFile);
    }
}

package SecondHW;
import java.util.Scanner;

public class SecondHW {
    public static void main(String args[]) {
        //task 1
        double result = ((1.0 / 2 + (3.0 / 17 * 5 / 2) + Math.sqrt(1.0 / 2)) / (2 / Math.pow(7, 3))) * ((9.0 / 2 + 3.0 / 4) / (1 / Math.pow(3, 3)));
        System.out.printf("The result of this example is %s \n", result);
        //task 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your first name: ");
        String firstName = scanner.next();
        System.out.println("Write your last name: ");
        String lastName = scanner.next();
        System.out.println("Write your CNP: ");
        String cnp = scanner.next();
        String firstTwoLetters = firstName.substring(0, 2).toLowerCase();
        String lastTwoLetters = lastName.substring(lastName.length() - 2).toUpperCase();
        String password = firstTwoLetters + lastTwoLetters;
        System.out.println(password + cnp);
        //task 3
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        if (number < 0) {
            System.out.println(number + " is not a palindrome.");
            return;
        }
        int originalNumber = number; // to save the initial number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
        //task 4 case 1
        int rows1 = 4;
        for (int i = 0; i < rows1; i++) {
            System.out.println("**********");
        }
        System.out.println("");
        //task 4 case 2
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  //
        }
        //task 4 case 3
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("");
        //task 4 case 4
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("");
        //task 4 case 5
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("");
        //task 4 case 6
        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        // unfortunately i find task 5 too complicated for me now
    }
}

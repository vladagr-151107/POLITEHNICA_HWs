package Lab5;

import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a sentence. ");
        String s = scanner.nextLine();
        System.out.println("Now we will find out if this sentence is palindrome or not.");
        System.out.print(palindromeI(s));
        System.out.println("");
        System.out.print(palindromeR(s));
    }
    public static boolean palindromeI(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean palindromeR(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return palindromeR(s.substring(1, s.length() - 1));
    }
}

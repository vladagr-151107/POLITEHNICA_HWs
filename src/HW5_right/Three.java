package HW5_right;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create a password using letters and digits. At least 8 symbols.");
        String s = scanner.nextLine();
        if(check(s)){
            System.out.println("The password is valid");
        } else{
            System.out.println("It does not meet requirements.");
        }
    }
    public static boolean check(String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) || str.length() < 8) {
                return false;
            }
        }
        return true;
    }
}

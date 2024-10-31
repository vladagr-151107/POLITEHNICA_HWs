package Lab5;
import java.util.Scanner;
public class Three {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings. First one is for the general sentence. Second - for the matches you wanna find. ");
        String string1 = scanner.nextLine();
        String string2 = scanner.next();
        int count = match(string1, string2);
        System.out.println(count);
    }
    public static int match(String string1, String string2){
        int count = 0;
        int index = 0;
        while((index = string1.indexOf(string2, index)) != -1){
            count++;
            index += string2.length();
        }
        return count;
    }
}

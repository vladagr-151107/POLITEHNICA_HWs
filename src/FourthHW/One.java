package FourthHW;
import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
    static  boolean isPrime(int number)
    {
        if(number<=1)
        {
            return false;
        }
        for(int i=2;i<=number/2;i++)
        {
            if((number%i)==0)
                return  false;
        }
        return true;
    }
}

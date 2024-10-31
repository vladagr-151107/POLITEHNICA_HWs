package Lab5;

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
        System.out.printf("Prime numbers which are less than %s. ", number);
        System.out.println("These are: ");
        genPrimes(number);
        System.out.printf("Determines of all the divisors are: %s", allPrimeDivisors(number));
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
    public static void genPrimes(int number){
        for(int i =2; i < number; i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
    public static boolean allPrimeDivisors(int number){
        for(int i = 1; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                System.out.println(i + " ");
                if(i != number / i){
                    System.out.println(number/i + " ");
                    return false;
                }
            }
        }
        return true;
    }
}

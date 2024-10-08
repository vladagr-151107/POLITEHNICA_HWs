package FirstHW;
import java.util.Scanner;

public class FirstHW {
    public static void main(String args[]) {
        //exercise 1
        //the mistake was shown because boolean can equal only true or false, not a number;
        //the second one was in "positive_flag == 0", because when we assign the value we must use only one "="
        int c = -4;
        int positive_flag = 0;
        if (c >= 0) {
            positive_flag = 1;
        }
        if (positive_flag == 1) {
            System.out.println("The variable c is a positive number");
        } else {
            System.out.println("The variable c is a negative number"); //added it so it would be clear the code works
        }
        //exercise 2
        double a, b, d;
        a = 2.2;
        b = 3.3;
        d = 10;
        double harmonicMean = 3 / 1 / a + 1 / b + 1 / d;
        System.out.println("The harmonic mean is " + harmonicMean);
        //exercise 3
        int sideOne, sideTwo, sideThree;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three sides of triangle to check if it's right-angled or not: ");
        sideOne = scanner.nextInt();
        sideTwo = scanner.nextInt();
        sideThree = scanner.nextInt();
        if (sideThree == Math.sqrt(Math.pow(sideOne, 2) + Math.pow(sideTwo, 2))) {
            System.out.println("The triangle is right-angled");
            double angleA = Math.toDegrees(Math.acos((Math.pow(sideOne, 2) + Math.pow(sideThree, 2) - Math.pow(sideTwo, 2)) / (2 * sideOne * sideThree)));
            double angleB = Math.toDegrees(Math.acos((Math.pow(sideTwo, 2) + Math.pow(sideThree, 2) - Math.pow(sideOne, 2)) / (2 * sideTwo * sideThree)));
            double angleC = 90.0;
            if (angleA == 45 && angleB == 45) {
                System.out.printf("The angles of the triangle are: %s, %s, %s", angleA, angleB, angleC);
            } else if (angleA == 30 || angleB == 30) {
                System.out.println("One of the angles equals 30 degrees");
            } else {
                System.out.println("There is no angle which equals 45 or 30");
            }
        } else {
            System.out.println("The triangle is not right-angled \n");
        }
        // an example of numbers to make a triangle right-angled: sideOne = 3, sideTwo = 4, sideThree = 5
        //an example to check that a triangle is not right-angled: sideOne = 2, sideTwo = 3, sideThree = 4

        //exercise 4
        System.out.println("Enter your American grade (A, B, C, D, F): ");
        char americanGrade = scanner.next().toUpperCase().charAt(0);
        int europeanGrade = 0;
        switch (americanGrade) {
            case 'A':
                europeanGrade = 10;
                break;
            case 'B':
                europeanGrade = 8;
                break;
            case 'C':
                europeanGrade = 7;
                break;
            case 'D':
                europeanGrade = 6;
                break;
            case 'F':
                europeanGrade = 0;
                break;
            default:
                System.out.println("Invalid grade entered. Please enter A, B, C, D, or F.\n");
                return;
        }
        System.out.printf("Your European grade would be %s \n", europeanGrade);
        // exercise 5
        String sport = "I like to play ";
        String basketball = "basketball";
        System.out.println("Enter your favourite sport");
        String favSport = scanner.next();
        System.out.println(sport + basketball);
        System.out.println(sport + favSport);
    }
}

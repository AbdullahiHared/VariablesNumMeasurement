import java.util.Scanner;
public class app {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        System.out.println("The first number");
        int firstNum = newScanner.nextInt();
        System.out.println("What is the second number? ");
        int secondNum = newScanner.nextInt();

        int sum = firstNum + secondNum;
        System.out.println("The sum of " + firstNum + " and " + secondNum + " is " + sum);
        System.out.println();
        System.out.println("Choose the first number to divide");
        double divideOne = newScanner.nextDouble();
        System.out.println("What number do you want to divide first number with? ");
        double divideTwo = newScanner.nextDouble();

        double division = divideOne / divideTwo;
        System.out.println("The division of " + divideOne + " and " + divideTwo + " is " + division);
        System.out.println();

        System.out.println("Modulo time:");
        System.out.println();

        System.out.println("Choose the first number: ");
        int moduloOne = newScanner.nextInt();

        System.out.println("Choose the second number: ");
        int moduloTwo = newScanner.nextInt();

        int remainder = moduloOne % moduloTwo;
        System.out.println("The remainder of " + moduloOne + " divided by " + moduloTwo + " is " + remainder);
        System.out.println();

        System.out.println("Potencies time:");

        {
            System.out.println("Choose the first number: ");
            double x = newScanner.nextDouble();
            System.out.println("Choose the second number");
            double y = newScanner.nextDouble();
            double potencResult = Math.pow(x,y);
            System.out.println(x + " to the power of " + y + " is " + potencResult);
        }


    }
}
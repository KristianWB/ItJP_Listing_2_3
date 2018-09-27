import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter 3 numbers
        System.out.print("Read in the first number: ");
        double number1 = input.nextDouble();
        System.out.print("Read in the second number: ");
        double number2 = input.nextDouble();
        System.out.print("Read in the third number: ");
        double number3 = input.nextDouble();

        // Compute average
        double average = (number1 + number2 + number3) / 3;

        // Display results
        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
    }
}
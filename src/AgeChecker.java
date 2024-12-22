import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        // Check the age and print the result
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // Close the scanner
        scanner.close();
    }
}

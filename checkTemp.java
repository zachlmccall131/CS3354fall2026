import java.util.Scanner;

public class checkTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperatureFahrenheit = scanner.nextDouble();

        if (temperatureFahrenheit <= 32) {
            System.out.println("It's freezing!");
        } else if (temperatureFahrenheit > 32 && temperatureFahrenheit <= 50) {
            System.out.println("It's cold.");
        } else if (temperatureFahrenheit >= 50 && temperatureFahrenheit <= 70) {
            System.out.println("It's cool.");
        } else if (temperatureFahrenheit >= 85 && temperatureFahrenheit <= 90) {
            System.out.println("It's warm.");
        } else {
            System.out.println("It's hot!");
        }
        scanner.close();
    }
}

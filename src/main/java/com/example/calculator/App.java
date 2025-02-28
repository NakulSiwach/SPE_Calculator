package com.example.calculator;

import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        while (true) {
            System.out.println("\nScientific Calculator");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Log (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter number: ");
                        double numSqrt = Double.parseDouble(scanner.nextLine());
                        System.out.println("√" + numSqrt + " = " + Calculator.squareRoot(numSqrt));
                        break;
                    case 2:
                        System.out.print("Enter integer: ");
                        int numFact = Integer.parseInt(scanner.nextLine());
                        System.out.println(numFact + "! = " + Calculator.factorial(numFact));
                        break;
                    case 3:
                        System.out.print("Enter number: ");
                        double numLog = Double.parseDouble(scanner.nextLine());
                        System.out.println("ln(" + numLog + ") = " + Calculator.naturalLog(numLog));
                        break;
                    case 4:
                        System.out.print("Enter base: ");
                        double base = Double.parseDouble(scanner.nextLine());
                        System.out.print("Enter exponent: ");
                        double exponent = Double.parseDouble(scanner.nextLine());
                        System.out.println(base + "^" + exponent + " = " + Calculator.power(base, exponent));
                        break;
                    case 5:
                        System.out.println("Exiting Calculator.");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please select between 1 and 5.");
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("Error: " + ex.getMessage());
            } catch (Exception ex) {
                System.out.println("Unexpected error: " + ex.getMessage());
            }
        }
    }
}

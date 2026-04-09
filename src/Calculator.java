import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                double result = 0;

                switch (choice) {
                    case 1:
                        result = add(a, b);
                        break;
                    case 2:
                        result = subtract(a, b);
                        break;
                    case 3:
                        result = multiply(a, b);
                        break;
                    case 4:
                        result = divide(a, b);
                        break;
                }

                System.out.println("Result: " + result);
            }

        } while (choice != 5);

        sc.close();
    }
}
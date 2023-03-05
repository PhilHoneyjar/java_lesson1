import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter operation (*, /, +, -): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        switch (operator) {
            case '*' -> System.out.printf("Result: %f", a * b);
            case '/' -> System.out.printf("Result: %f", a / b);
            case '+' -> System.out.printf("Result: %f", a + b);
            case '-' -> System.out.printf("Result: %f", a - b);
            default -> System.out.println("Incorrect operation");
        }
    }
}
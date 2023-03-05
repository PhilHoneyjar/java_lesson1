import java.util.Scanner;

public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = sc.nextFloat();

        System.out.print("Enter operation (*, /, +, -): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        float b = sc.nextFloat();

        switch (operator) {
            case '*' -> System.out.printf("Result: %f", a * b);
            case '/' -> System.out.printf("Result: %f", a / b);
            case '+' -> System.out.printf("Result: %f", a + b);
            case '-' -> System.out.printf("Result: %f", a - b);
            default -> System.out.println("Incorrect operation");
        }
    }
}
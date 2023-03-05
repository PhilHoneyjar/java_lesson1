import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number: ");
        int a= sc.nextInt();

        System.out.println("Triangle is: " + getTriangle(a));
        System.out.println("Factorial is: " + getFactorial(a));
    }
    public static int getTriangle(int number) {
        if (number <= 1) {
            return 1;
        }
        else {
            return number + getTriangle(number - 1);
        }
    }
    public static int getFactorial(int number) {
        if (number <= 1) {
            return 1;
        }
        else {
            return number * getFactorial(number - 1);
        }
    }
}

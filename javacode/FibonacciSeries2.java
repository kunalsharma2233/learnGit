import java.util.Scanner;
public class FibonacciSeries2 {
    static int number1 = 0;
    static int number2 = 1;
    static int number3 = 0;
    static int count = 0;

    public static void printFibonacciSeries(int count) {
        if(count > 0 ) {
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
            System.out.println(" "+number3);
            printFibonacciSeries(count - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("This program is for Fibonacci series program");
        Scanner readInput = new Scanner(System.in);
        count = readInput.nextInt();
        printFibonacciSeries(count);
    }
}

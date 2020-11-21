package my.calculator;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Введите выражение: ");
            String expression = in.nextLine();
            if (expression.isEmpty()) {
                break;
            }
            Operator operator = new Operator();
            Iterator iterator = new Iterator(expression);
            Calculator calculator = new Calculator(operator, iterator);
            try {
                System.out.printf("%.2f%n", calculator.getResult());
                System.out.println();
            }
            catch (NullPointerException | EmptyStackException e) {
                System.out.println("Введите верное выражение!");
                System.out.println();
            }
        }
    }
}

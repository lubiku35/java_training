// 1. Napište metodu, která přečte z konzole dvě čísla a vypíše jejich součet, rozdíl, součin a podíl, včetně informace o vypisované hodnotě.
package exercise_01;
import java.util.Scanner;
public class Script {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number_x = input.nextDouble();

        System.out.print("Enter first number: ");
        double number_y = input.nextDouble();

        double add = number_x + number_y;
        double sub = number_x - number_y;
        double mul = number_x * number_y;
        double div = number_x / number_y;

        System.out.printf("Result of Addition of %.2f and %.2f is %.2f%n", number_x, number_y, add);
        System.out.printf("Result of Subtraction of %.2f and %.2f is %.2f%n", number_x, number_y, sub);
        System.out.printf("Result of Multiplication of %.2f and %.2f is %.2f%n", number_x, number_y, mul);
        System.out.printf("Result of Division of %.2f and %.2f is %.2f%n", number_x, number_y, div);

    }
}

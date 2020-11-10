/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
*/
import java.util.Scanner;

public class Main {
    public static Boolean min(double a, double b) {
        boolean b1 = false;
        if (a + b > 10)
            b1 = true;

        return b1;
    }

    public static void main(String[] args) {

        System.out.println("Введите значение №1 ");

        Scanner num1 = new Scanner(System.in);
        double num11 = num1.nextDouble();

        System.out.println("Введите значение №2 ");

        Scanner num2 = new Scanner(System.in);
        double num22 = num2.nextDouble();

        System.out.println("Сумма дву чисел больше 10 " + "\n" + min(num11, num22));
    }
}

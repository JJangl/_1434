/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner ScanNumber = new Scanner(System.in);
        double UserInputNumber =ScanNumber.nextDouble();
        System.out.println("Input number + 15% =");
        double  UvelichChislo;
        UvelichChislo = 1.15 * UserInputNumber;
        System.out.println(UvelichChislo);
    }
}

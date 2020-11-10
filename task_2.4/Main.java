/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите сумму вклада");
        Scanner scansum = new Scanner(System.in);
        double sumvkl = scansum.nextDouble();

        System.out.println("Введите процент по вкладу");
        Scanner scanproc = new Scanner(System.in);
        double procent = scanproc.nextDouble() / 100;
        
        for (int i = 1; i < 6; i++) {
            sumvkl += sumvkl * procent;
            System.out.println(" " + i + " год = " + sumvkl);
        }
    }
}

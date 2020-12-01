/*
 * Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа, которые больше нуля и меньше 10-ти.
 * Коллекции вы создаёте сами
 */


import java.util.ArrayList;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        ArrayList<Double> num = new ArrayList<>();
        ArrayList<Double> Newnum = new ArrayList<>();
        Double numss = null;
        String userAnswer = "нет";

        while (!userAnswer.equals("Да")) {
            System.out.println( "Добавьте число в массив");
            numss=scanner.nextDouble();
            num.add(numss);
            System.out.println("Если закончен ввод чисел  наберите Да в противном случае наберите любой символ алфавита");
            userAnswer= scanner2.nextLine();
        }
        System.out.println("Коллекция с числами");
        System.out.println(num);

        for (int i = 0; i <num.size() ; i++) {
            if (num.get(i)>0&&num.get(i)<10) {
                Newnum.add(num.get(i));
            }
        }
        System.out.println("Новый массив" +Newnum);
    }
}

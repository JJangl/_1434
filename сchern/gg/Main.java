/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner massiv = new Scanner(System.in);
        int sizearray = 10;
        int[] array10 = new int[sizearray];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < sizearray; i++) {
            array10[i] = massiv.nextInt();
        }
        arrayprint(array10, sizearray);
        int sov1 = 0;
        int sov2 = 0;
        int sov3 = 0;
        int sov4 = 0;
        int sov5 = 0;

        int ost1 = 0;
        int ost2 = 0;
        int ost3 = 0;
        int ost4 = 0;
        int ost5 = 0;
        System.out.println("\n" + "eeeeeeeee");

        for (int i = 1; i < array10.length-1; i++) {

            if (array10[i] == array10[i - 1]) {
                sov1 = sov1 + 1;
                if (array10[i] != array10[i + 1]) {
                    ost1 = i+1;
                    break;
                }

            }

        }

        for (int i = ost1; i <array10.length-1 ; i++) {

            if (array10[i] == array10[i + 1]) {
                sov2 = sov2 + 1;

            }
            if (array10[i] != array10[i + 1]) {
                ost2 = i+1;
                break;
            }

        }
        for (int i = ost2; i < array10.length-1 ; i++) {

            if (array10[i] == array10[i + 1]) {
                sov3 = sov3 + 1;

                }
            if (array10[i] != array10[i + 1]) {
                ost3 = i+1;

                break;
            }

        }
        for (int i = ost3; i < array10.length-1; i++) {
            if (array10[i] == array10[i + 1]) {
                sov4 = sov4 + 1;

            }
            if (array10[i] != array10[i + 1]) {
                ost4 = i+1;

                break;
            }

        }
        for (int i = ost4; i < array10.length-1; i++) {
            if (array10[i] == array10[i + 1]) {
                sov5 = sov5 + 1;

            }
            if (array10[i] != array10[i + 1]) {
                ost5 = i+1;

                break;
            }

        }


        System.out.println("\n" + "ost1=" + ost1 + "\n" + "ost2=" + ost2 + "\n"
                +"ost3=" + ost3+ "ost4=" + ost4+"      " +"sov1=" + sov1 + "\n" +
                "sov2=" + sov2+"sov3="+sov3+"sov4="+sov4+"sov5="+sov5);
        }

    public static void arrayprint(int mas[], int b) {
        System.out.print("Печать  массива из 10 чисел:" + "\n");
        for (int i = 0; i < b; i++) {
            System.out.print(" " + mas[i]); // Выводим на экран, полученный массив
        }
    }


}

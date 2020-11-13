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

        for (int i = 1; i < array10.length; i++) {


            if (array10[i] == array10[i - 1]) {
                sov1 = sov1 + 1;
                if (i == array10.length - 1) {
                    ost1 = i;

                    break;
                }
                if (array10[i] != array10[i + 1]) {
                    ost1 = i;

                    break;
                }
            }
        }
        System.out.println("sov4==="+sov4);
        for (int j = ost1 + 1; j < array10.length; j++) {
            ost2 = j;
            if (array10[j] == array10[j - 1]) {
                sov2 = sov2 + 1;
                if (j == array10.length - 1) {


                    break;
                }
                if (array10[j] != array10[j + 1]) {


                    break;
                }
            }
            System.out.println("sov4"+sov4);

        }
        System.out.println("kkkk=======ost"+ost2);
        for (int k = ost2 + 1; k < array10.length; k++) { //не выполн
            System.out.println("kkkk======="+k);
            ost3 = k;
            System.out.println("kkkk======="+k);
            System.out.println("!!!!!!!!!!ost333333333"+ost3);
            if (array10[k] == array10[k - 1]) {
                sov3 = sov3 + 1;
                if (k == array10.length - 1) {
                    System.out.println("kkkk======="+k);
                    break;
                }
                System.out.println("sov4"+sov4);
                if (array10[k] != array10[k + 1]) {
                    System.out.println("kkkk======="+k);

                    break;
                }
                System.out.println("kkkk======="+k);
                System.out.println("!!!!!!!!!!ost333333333="+ost3);
            }

        }

        System.out.println("ost333333333"+ost3);
        for (int l = ost3 + 1; l < array10.length; l++) {
            ost4 = l;
            System.out.println("sov4!!!!!!!!!" + sov4);
            if (array10[l] == array10[l - 1]) {
                sov4 = sov4 + 1;
                System.out.println("sov4!!!" + sov4);
                if (l == array10.length - 1) {

                    break;
                }
                if (array10[l] != array10[l + 1]) {


                    break;
                }
                System.out.println("sov4!" + sov4);

            }
        }
        for (int m = ost4 + 1; m < array10.length; m++) {
            ost5 = m;
            if (array10[m] == array10[m - 1]) {
                sov5++;
                if (m == array10.length - 1) {

                    break;
                }
                if (array10[m] != array10[m + 1]) {
                    break;
                }
            }
            System.out.println("sov4!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+sov4);
        }
        System.out.println("\n" + "ost1=" + ost1 + "\n" + "ost2=" + ost2 + "\n" +"ost3=" + ost3+ "ost4=" + ost4+"      " +"sov1" + sov1 + "\n" + "sov2=" + sov2+"sov3="+sov3+"sov4="+sov4+"sov5="+sov5);

        int[] massrav = {sov1, sov2, sov3, sov4, sov5};
        int maxdl = 1;
        for (int i = 0; i < 5; i++) {
            if (massrav[i] >= maxdl) {
                maxdl += massrav[i];
            }
        }
        System.out.println("Max len=" + maxdl);
    }


    public static void arrayprint(int mas[], int b) {
        System.out.print("Печать  массива из 10 чисел:" + "\n");
        for (int i = 0; i < b; i++) {
            System.out.print(" " + mas[i]); // Выводим на экран, полученный массив
        }
    }


}

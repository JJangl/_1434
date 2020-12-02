
/*
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите путь");
        String scan = scann.nextLine();
        scan = "C://java//test.txt";//временно чтобы не вводить постоянно
        ArrayList<String> numberr = new ArrayList();//массив для четных чисел
        String newnum = "";
        try {
            FileReader reader = new FileReader(scan);
            int c;

            while ((c = reader.read()) != -1) {
                System.out.println(c);
                if (c == 13){
                    continue;
                }else if (c == 10){

                    numberr.add(newnum);
                    newnum="";

                }else {

                    newnum = newnum + (char) c;


                }

            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newnum);
        System.out.println("масив" +numberr);

        ArrayList<Integer> numberr2 = new ArrayList();//массив цифр
       int i=0;
        for (String cint:numberr) {
            int newcint = Integer.parseInt(cint);
            if (newcint % 2 == 0)
                numberr2.get(i)=newcint; ///туплю  попытка стринг масив перевести в цифру чтобы потом отсортировать&&&&
            i++;
                System.out.println(newcint);
        }



        }

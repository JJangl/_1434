

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
        ArrayList<Integer> numberr = new ArrayList();//массив для четных чисел
        String newnum = "л";
        try {
            FileReader reader = new FileReader(scan);
            int c;

            while ((c = reader.read()) != -1) {
                if ((c != 10) && (c != 13))//убираем лишние символы
                    System.out.println(c);
                newnum += (char) c; //копируем символы из файла в новую переменную стринг
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newnum);
        //перевод string в int
        try {
            int i = Integer.parseInt(newnum.trim());
            System.out.print("int i=" + newnum);
        } catch (NumberFormatException nfe){
            System.out.println("\nNumberFormatException: " +"\n"+ nfe.getMessage());
    }
    }
}

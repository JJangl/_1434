/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        double num[] = {2, 4, 7, 4, 2, 9, 5};

        String dailnet= "нет";
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 5) {
                dailnet= "Да";
                break;
            }
    }
        System.out.println(dailnet);
}
}

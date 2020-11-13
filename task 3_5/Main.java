/*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/


public class Main {
    public static void main(String[] args) {
        int num[] = {4, 2, 6, 2, 65};
        Mass(num,0);
    }
        public static void Mass(int mas[],int b) {
            if(b< mas.length) {
                System.out.println(mas[b]);
                b++;
                Mass(mas,b);
            }
        }
}

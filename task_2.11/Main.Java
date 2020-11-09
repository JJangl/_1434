/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить, чтобы в сумме получилось больше 10-ти.
*/
public class Main {
    public static void main(String[] args) {

        int numbers[] = {1, 2, 12, 3, -10, 10};
        int sum = 0;
        int numelem = 0;

           for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (sum >= 10) {
                numelem = i + 1;
                System.out.println("Миниммальное количество элементов для суммы больше 10 =  "+ numelem);
                break;
            }
            }
        }

/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {

        int numbers[] = {1, 2,4,3,2,9 };
         String result= "Нет" ;
         
        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i]==numbers[i-1]) result="Да";
        }
        System.out.println(result);
    }


}

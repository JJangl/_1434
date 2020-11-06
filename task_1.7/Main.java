/* Задача наполнить корабельный бассейн. Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются запрашиваются у пользователя. Прграмма должена вывести на экран количество литров воды,
которое нужно для наполнения бассейна.
Пример:
Пользователь даёт числа 25, 5, 2.
Пример вывода:
250000 */



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Длинна бассейна");
        Scanner Lenght = new Scanner(System.in);
        double a =Lenght.nextDouble();

        System.out.println("Ширина бассейна");
        Scanner width = new Scanner(System.in);
        double b =width.nextDouble();

        System.out.println("Глубина бассейна");
        Scanner depth = new Scanner(System.in);
        double c =depth.nextDouble();

        
        System.out.println("Количество воды в бассейне (л) = ");
        double  AmountofWater;
        AmountofWater = a*b*c*1000;
        System.out.println(AmountofWater);
    }
}

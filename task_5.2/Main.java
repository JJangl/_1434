/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <String> familyList = new ArrayList<>();
        List <String> сityList = new ArrayList<>();


        System.out.println("введите фамилии ");
        while (true) {

            String family = scanner.nextLine();
            if (family.isEmpty()) break;
            else  if (familyList.indexOf(family)!=-1) {
                System.out.println(family + " Фамилия введена ранее, введите другую фамилию");
            }
            else familyList.add(family);
        }
        System.out.println("введите города"+"\n");
        while (сityList.size() < familyList.size()) {

            String сity = scanner.nextLine();
            сityList.add(сity);
        }
        System.out.println("Введите фамилию : ");
        String family = scanner.nextLine();
        int indexfamily = familyList.indexOf(family);
        if (indexfamily!=-1) {
            System.out.println("место жительства   город ." + сityList.get(indexfamily));
        }
        else System.out.println("Данные о месте жительства отсутствуют ");
    }
}


/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main{
    public static void main(String[] args) {
    Horse Loki = new Horse("Luck",10);
    Pegas FlyM= new Pegas("tall",15);
    Loki.run();
    FlyM.fly();
    }
}
class Animal {
    String nickname;
    int age;
    public Animal(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }
}
class Horse extends Animal {
    public Horse(String nickname, int age) {
        super(nickname, age);
    }
    public void run(){
        System.out.println("Игого, я поскакал(а)");
    }
}
class Pegas extends Horse {
    public Pegas(String nickname, int age) {
        super(nickname, age);
    }
    public void fly(){
        System.out.println("Игого, я полетел(а)");
    }
}

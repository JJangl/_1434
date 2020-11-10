public class Main {
    public static void main(String[] args) {
        double num[] = {2, 4, 7, 4, 2, 9, 5};

        for (int i = 0; i < num.length; i++) {

            if (num[i] == 5) {
                System.out.println("да");
                break;
            }
            else if (i==num.length-1) System.out.println("нет");
    }
}
}

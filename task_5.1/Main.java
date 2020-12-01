public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList();
        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");
        names.add("Павел");
        names.add("Руслан");

        for (int i = 0; i < names.size(); i++) {

            if (names.indexOf(names.get(i))==-1){
                System.out.println("нет совп");

            }
            else
                names.remove(i);
          
        }
        System.out.println(names);
    }


}

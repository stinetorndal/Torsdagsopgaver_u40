package Task2;

public class Main {
    static void main() {
Cafe cafe = new Cafe();
cafe.loadMenuData();

        System.out.println("Menukort for kaffe");
        for (String c : cafe.getCoffeeMenu()){
            System.out.println(c);
        }
    }


}

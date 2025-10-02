package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private final ArrayList<String>coffeeMenu = new ArrayList<>();

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

//min loadMenu-metode
public void loadMenuData(){
        //sti ændret og [data/] indsat for at give rette sti til tekstfilen
    File file = new File("data/coffee.txt");
    //Har indsat denne, fordi java ikke havde kunne finde stien til coffee
    System.out.println("Looking for file at: " + file.getAbsolutePath());

    try {
        Scanner scanner = new Scanner (file);

     while (scanner.hasNextLine()) {
         coffeeMenu.add(scanner.nextLine());
             }
    } catch (FileNotFoundException e) {
        System.out.println("Kan ikke finde fil. Check navn og sti");
    }
}
}
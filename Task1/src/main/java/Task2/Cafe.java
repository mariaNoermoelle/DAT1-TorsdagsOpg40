package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe
{

    private ArrayList<String> coffeeMenu = new ArrayList<String>();

    public void loadMenuData()
    {
        File file = new File("Coffees.txt");
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine())
            {
                coffeeMenu.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file.");
        }
    }
}

package OOP15;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class To_Do_List {

    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<String>();
        System.out.println("Enter items for the list, when prompted");
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        do {
            System.out.println("Type an entry:");
            String entry = keyboard.nextLine();
            toDoList.add(entry);
            System.out.println("More items for the list? (yes)");
            if (!keyboard.nextLine().equalsIgnoreCase("yes"))
                done = true;
        } while (!done);
        System.out.println("The list contains:");
       /* for(int pos = 0; pos < toDoList.size(); pos++)
            System.out.println(toDoList.get(pos));


    }*/
       toDoList.forEach(element -> System.out.println(element));
        for (String element : toDoList) { //for each 문으로 만들어도됨 위에꺼랑 똒같은것.

            System.out.println(element);
        }
    }
}
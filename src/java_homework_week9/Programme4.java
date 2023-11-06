package java_homework_week9;

import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and printout the collection using for each loop.
 */
public class Programme4 {
    public static void main(String[] args) {
        colours();
    }
    public static void colours() {
        ArrayList<String> colourList = new ArrayList<>();
        colourList.add("Black");
        colourList.add("Pink");
        colourList.add("Red");
        colourList.add("White");
        for (String colour : colourList) {
            System.out.println(colour);
        }
    }
}

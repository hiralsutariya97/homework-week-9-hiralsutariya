package java_homework_week9;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme7 {
    public static void main(String[] args) {
        emptyList();
    }
    public static void emptyList() {
        ArrayList<String> emptyList = new ArrayList<>();
        //Define value
        emptyList.add("America");
        emptyList.add("Africa");
        emptyList.add("Canada");
        emptyList.add("London");
        emptyList.add("Singapore");
        emptyList.add("Germany");
        emptyList.add("Japan");

        //array list is empty or not
        System.out.println(emptyList.isEmpty());
    }
}

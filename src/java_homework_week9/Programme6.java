package java_homework_week9;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Programme6 {
    public static void main(String[] args) {
        list();
    }
    public static void list() {
        ArrayList<String> list = new ArrayList();
        list.add("Hiral");
        list.add("Asha");
        list.add("Viral");
        list.add("Simona");
        list.add("Cristina");

        //getting value "Simona" in console
        System.out.println(list.get(3));
    }
}

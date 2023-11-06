package java_homework_week9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using Iterater.
 */
public class Programme5 {
    public static void main(String[] args) {
        iterate();
    }
    public static void iterate() {
        ArrayList<Integer> iterateList = new ArrayList<>();
        iterateList.add(100);
        iterateList.add(200);
        iterateList.add(300);
        iterateList.add(400);
        iterateList.add(500);
        iterateList.add(600);

        //using iterator
        Iterator iterator = iterateList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

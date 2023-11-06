package java_homework_week9;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Create a HashMap object called people that will store String keys and Integer values: And use for each loop to iterate the value from Map.
 */
public class Programme9 {
    public static void main(String[] args) {
        tree();
    }
    public static void tree() {
        ArrayList<String> treeList = new ArrayList<>();
        treeList.add("Lily");
        treeList.add("Oak");
        treeList.add("Pine");
        treeList.add("Alder");
        treeList.add("Willow");
        treeList.add("Juniper");
        treeList.add("Hazel");
        treeList.add("Mapel");
        treeList.add("Rowan");
        System.out.println(treeList);

        ListIterator<String> iterator = treeList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

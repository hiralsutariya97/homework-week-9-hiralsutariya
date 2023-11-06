package java_homework_week9;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme3 {
    public static void main(String[] args) {

        reverse();
    }

    public static void reverse() {
        int a[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("Array in reverse order: ");
        //loop through the array in reverse order
        for (int i = a.length - 1; i > 0; i--) {
            System.out.println(a[i] + " ");
        }
    }
}

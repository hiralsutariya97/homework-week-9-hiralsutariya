package calculate;

import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {
        int a, b;
        char symbol, repeat;
        Main obj = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        a = scanner.nextInt();
        System.out.print("Enter number 2: ");
        b = scanner.nextInt();
        System.out.println("Select any operator from '+'|'-'|'/'|'*' to get calculation ");
        symbol = scanner.next().charAt(0);
        obj.calculateResult(a, b, symbol);

        System.out.print("Calculate again! 'Y||y' for Yes ,'N||n' for No ");
        while (scanner.hasNext()) {
            repeat = scanner.next().charAt(0);
            if (repeat == 'y' || repeat == 'Y') {
                System.out.print("Enter number 1: ");
                a = scanner.nextInt();
                System.out.print("Enter number 2: ");
                b = scanner.nextInt();
                System.out.println("Select any operator from '+'|'-'|'/'|'*' to get calculation ");
                symbol = scanner.next().charAt(0);
                obj.calculateResult(a, b, symbol);
                System.out.print("Calculate again! 'Y||y' for Yes ,'N||n' for No ");
            } else {
                System.out.println("Program Terminated ");
            }
        }
    }
}


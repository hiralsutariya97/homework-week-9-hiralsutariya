package java_homework_week9;

import java.util.Scanner;

/**
 * Rewrite the student mark sheet programme (From java-homework-week3 programmes) using if else and while loop.
 */
public class Programme2 {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        char continueCalculation = 'Y';

        //while loop
        while (continueCalculation == 'Y' || continueCalculation == 'y') {
            System.out.println("Enter student name:");
            String name = scanner.next();
            System.out.println("Enter student Roll no:");
            int rollno = scanner.nextInt();
            System.out.println("Enter Maths Marks:");
            double mathMarks = scanner.nextDouble();
            System.out.println("Enter Science Marks:");
            double scienceMarks = scanner.nextDouble();
            System.out.println("Enter English marks:");
            double englishMarks = scanner.nextDouble();
            result(mathMarks, scienceMarks, englishMarks, name, rollno);
            continueCalculation = scanner.next().charAt(0);
            //Scanner closing
            scanner.close();
        }
    }

    public static void result(double Maths, double Science, double English, String name, int rollNo) {
        //Calculation of total marks & result
        if (Maths < 0 || Maths > 100 || Science < 0 || Science > 100 || English < 0 || English > 100) {
            System.out.println("Invalid input, Marks has to be between 0 to 100");
        } else {
            double totalMarks = Maths + Science + English;
            double percentage = (totalMarks / 300) * 100;
            String result = (percentage >= 35 && Maths >= 35 && Science >= 35 && English >= 35) ? "Pass" : "Fail";

            //Calculation of Grade
            String Grade = "-";
            if (Maths >= 35 && Science >= 35 && English >= 35) {
                if (percentage <= 100 && percentage >= 80) {
                    Grade = "A+";
                } else if (percentage < 80 && percentage >= 60) {
                    Grade = "A";
                } else if (percentage < 60 && percentage >= 50) {
                    Grade = "B";
                } else if (percentage < 50 && percentage >= 35) {
                    Grade = "C";
                } else {
                    Grade = "Fail";
                }
                //Displaying the result
                System.out.println("Pass");
                System.out.println("Percentage: " + percentage);
                System.out.println("Grade: " + Grade);
            } else {
                System.out.println("Fail");
            }
            //Printing the Mark Sheet
            System.out.println("|________________________________|");
            System.out.println("|        Mark Sheet              |");
            System.out.println("|________________________________|");
            System.out.println("| Name:" + name + "              |");
            System.out.println("| Roll No:" + rollNo + "         |");
            System.out.println("|________________________________|");
            System.out.println("| Subjects: Marks                |");
            System.out.println("|________________________________|");
            System.out.println("| Math:" + Maths + "             |");
            System.out.println("| Science:" + Science + "        |");
            System.out.println("| English:" + English + "        |");
            System.out.println("|________________________________|");
            System.out.println("| Total:" + totalMarks + "       |");
            System.out.println("|________________________________|");
            System.out.println("| Percentage:" + percentage + "  |");
            System.out.println("| Result:" + result + "          |");
            System.out.println("| Grade:" + Grade + "            |");
            System.out.println("|________________________________|");
        }
    }
}




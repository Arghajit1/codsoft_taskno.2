import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        int[] marks = new int[numSubjects];
        int totalMarks = 0;
        String[] subname = new String[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the subject name: ");
            subname[i] = sc.nextLine(); 
            System.out.print("Enter marks obtained in " + subname[i] + " (out of 100): ");
            marks[i] = sc.nextInt();
            sc.nextLine(); // consume newline
            totalMarks += marks[i];
        }

        double averagePercentage = (double) totalMarks / numSubjects;

        // change to String instead of char
        String grade;
        if (averagePercentage >= 90) {
            grade = "AA";
        } else if (averagePercentage >= 80) {
            grade = "A+";
        } else if (averagePercentage >= 70) {
            grade = "A";
        } else if (averagePercentage >= 60) {
            grade = "B+";
        } else if (averagePercentage >= 50) {
            grade = "B";
        } else if (averagePercentage >= 40) {
            grade = "C";
        } else if (averagePercentage >= 30) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("\n----- Results -----");
        System.out.println("Student Name: " + name);
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subname[i] + ": " + marks[i]);
        }
        System.out.println("Total Marks = " + totalMarks + " out of " + (numSubjects * 100));
        System.out.println("Average Percentage = " + averagePercentage + "%");
        System.out.println("Grade = " + grade);

        sc.close();
    }
}

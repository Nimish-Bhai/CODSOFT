package gradecalculator;
import java.util.Scanner;

public class gradecalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double A_GRADE_THRESHOLD = 90.0;
        final double B_GRADE_THRESHOLD = 80.0;
        final double C_GRADE_THRESHOLD = 70.0;
        final double D_GRADE_THRESHOLD = 60.0;

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int subjectMarks = scanner.nextInt();
            totalMarks += subjectMarks;
        }

        System.out.println("\nTotal Marks: " + totalMarks);

        double averagePercentage = (double) totalMarks / numSubjects;
        System.out.println("Average Percentage: " + averagePercentage + "%");

        char grade;

        if (averagePercentage >= A_GRADE_THRESHOLD) {
            grade = 'A';
        } else if (averagePercentage >= B_GRADE_THRESHOLD) {
            grade = 'B';
        } else if (averagePercentage >= C_GRADE_THRESHOLD) {
            grade = 'C';
        } else if (averagePercentage >= D_GRADE_THRESHOLD) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

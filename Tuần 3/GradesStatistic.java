import java.util.Scanner;

public class GradesStatistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStd = scanner.nextInt();

        int[] stdGrade = new int[numStd];
        
        if (stdGrade.length > 0) {
            for (int i = 1; i <= numStd; ++i) {
                System.out.print("Enter the grade for student " + i + " : ");
                stdGrade[i-1] = scanner.nextInt();
            }
            
            scanner.close();
            
            int sum = 0;
            int max = stdGrade[0];
            int min = stdGrade[0];

            for (int i = 0; i < numStd; ++i) {
                sum += stdGrade[i];
                if (stdGrade[i] < min) {
                    min = stdGrade[i];
                } else if (max < stdGrade[i]) {
                    max = stdGrade[i];
                }
            }
            double average = (double) sum / numStd;
    
            System.out.printf("The average is: %.2f%n", average);
            System.out.println("The minimum is: " + min);
            System.out.println("The maximum is: " + max);
        } else {
            System.out.println("The are no students here !");
        }
    }
}

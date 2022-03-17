import java.util.Scanner;

public class GradesStatistic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int NumStd = scanner.nextInt();

        int[] StdGrade = new int[NumStd];
        
        if (StdGrade.length > 0) {
            for (int i = 1; i <= NumStd; ++i) {
                System.out.print("Enter the grade for student " + i + " : ");
                StdGrade[i-1] = scanner.nextInt();
            }
            
            scanner.close();
            
            int sum = 0;
            int max = StdGrade[0];
            int min = StdGrade[0];
            for (int i = 0; i < NumStd; ++i) {
                sum += StdGrade[i];
                if (StdGrade[i] < min) {
                    min = StdGrade[i];
                } else if (max < StdGrade[i]) {
                    max = StdGrade[i];
                }
            }
            double average = (double) sum / NumStd;
    
            System.out.printf("The average is: %.2f%n", average);
            System.out.println("The minimum is: " + min);
            System.out.println("The maximum is: " + max);
        } else {
            System.out.println("The are no students here !");
        }
    }
}

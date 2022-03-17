import java.util.Scanner;

public class GradesStatistics_2 {
    public static double findMedian(int[] array) {
        double median = 0;
        int n = array.length;
        if (n % 2 == 0) {
            median = array[n/2];
        } else {
            median = (double) (array[(n / 2) - 1] + array[n / 2]) / 2;
        }
        
        return median;
    }
    public static void print(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            } else if (i == (array.length - 1)) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int NumStd = scanner.nextInt();

        int[] StdGrade = new int[NumStd];
        
        if (StdGrade.length > 0) {
            for (int i = 1; i <= NumStd; ++i) {
                System.out.print("Enter the grade (between 0 and 100) for student " + i + " : ");
                StdGrade[i-1] = scanner.nextInt();
                if (StdGrade[i-1] < 0 && StdGrade[i-1] > 100) {
                    System.out.println("Error! Please try again");
                    System.out.print("Enter the grade for student " + i + " : ");
                    StdGrade[i-1] = scanner.nextInt();
                    
                }
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

            //calculate standard deviation
            double temp = 0;
            for (int i = 0; i < NumStd; ++i) {
                temp += (double) Math.Pow(StdGrade[i] - average, 2); 
            }
            
            double std = (double) Math.Sqrt(temp / (NumStd - 1));
            
            //print
            System.out.print("The grades are : ");
            print(StdGrade);

            System.out.printf("The average is: %.2f%n", average);

            System.out.printf("The median is: %.2f%n", findMedian(StdGrade));

            System.out.println("The minimum is: " + min);

            System.out.println("The maximum is: " + max);

            System.out.printf("The standard deviation is: %.2f%n", std);

        } else {
            System.out.println("The are no students here !");
        }
    }
}

import java.util.Scanner;

public class Grades_Statistics {
    public static void swap(int[] array) {
        int temp;
        for (int i = 0; i < array.length; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = array[i];
                }
            }
        }
        
    }
    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        
        double average = (double) sum / array.length;
        
        return average;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < min) {
                min = array[i];
            } 
        }
        
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
            } 
        }
        
        return max;
    }

    public static double findMedian(int[] array) {
        double median = 0;
        int n = array.length;
        swap(array);
        
        if (n % 2 != 0) {
            median = array[n/2];
        } else {
            median = (double) (array[(n / 2) -1 ] + array[n / 2]) / 2;
        }
        
        return median;
    }

    public static double std(int[] array) {
        double temp = 0;
        for (int i = 0; i < array.length; ++i) {
            temp += (double) Math.pow(array[i],2) - Math.pow(average(array), 2); 
        }
        
        double std = (double) Math.sqrt(temp / array.length);

        return std;
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
        
        boolean isErr_1 = false;
        boolean isErr_2 = false;
        
        do {
            System.out.print("Enter the number of students: ");
            int NumStd = scanner.nextInt();
    
            int[] StdGrade = new int[NumStd];
            
            if (StdGrade.length <= 100) {
                
                isErr_1 = true;
                
                for (int i = 1; i <= NumStd; ++i) {
                    isErr_2 = false;
                    do {
                        System.out.print("Enter the grade (between 0 and 100) for student " + i + " : ");
                        StdGrade[i-1] = scanner.nextInt();
                        if (StdGrade[i-1] > 0 && StdGrade[i-1] < 100) {
                            isErr_2 = true;
                        } else {
                            System.out.println("Error! Please try again"); 
                        }     
                    } while (!isErr_2);
                }
                
                scanner.close();
                
                //print
                System.out.print("The grades are : ");
                print(StdGrade);
    
                System.out.printf("The average is: %.2f%n", average(StdGrade));
    
                System.out.printf("The median is: %.2f%n", findMedian(StdGrade));
    
                System.out.println("The minimum is: " + findMin(StdGrade));
    
                System.out.println("The maximum is: " + findMax(StdGrade));
    
                System.out.printf("The standard deviation is: %.2f%n", std(StdGrade));
    
            } else {
                System.out.println("Error! Try again.");
                isErr_1 = false;
            }
        } while (!isErr_1);
    }
}

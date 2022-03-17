import java.util.Scanner;

public class GradesHistogram2 {
    public static int[] CountGrade(int[] array) {
        int[] GradeRange = new int[10];

        for (int i = 0; i < array.length; ++i) {
            if (array[i] >= 0 && array[i] <= 9) {
                GradeRange[0]++;
            } else if (array[i] >= 10 && array[i] <= 19) {
                GradeRange[1]++;
            } else if (array[i] >= 20 && array[i] <= 29) {
                GradeRange[2]++;
            } else if (array[i] >= 30 && array[i] <= 39) {
                GradeRange[3]++;
            } else if (array[i] >= 40 && array[i] <= 49) {
                GradeRange[4]++;
            } else if (array[i] >= 50 && array[i] <= 59) {
                GradeRange[5]++;
            } else if (array[i] >= 60 && array[i] <= 69) {
                GradeRange[6]++;
            } else if (array[i] >= 70 && array[i] <= 79) {
                GradeRange[7]++;
            } else if (array[i] >= 80 && array[i] <= 89) {
                GradeRange[8]++;
            } else if (array[i] >= 90 && array[i] <= 100) {
                GradeRange[9]++;
            } 
        }
        return GradeRange;
    }

    public static void printVertical(int[] array) {
        int firstNum = 0;
        int lastNum = 9;
        for (int i = 0; i < array.length; ++i) {
            System.out.printf("%2d - %2d: ", firstNum, lastNum);
            firstNum += 10;
            if (lastNum == 89) {
                lastNum += 11;
            } else {
                lastNum += 10;
            }
            for (int starNo = 1; starNo <= array[i]; ++starNo) {
                System.out.print("*");
            }
            System.out.println("");
        }
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

    public static void printHorizontal(int[] array) {
        int firstNum = 0;
        int lastNum = 9;
        int Max_array = findMax(array);
        int[][] GradeRange2 = new int[Max_array + 1][array.length];
        int index = array.length + 1 ;

        for (int i = 0; i < Max_array; ++i) {
            for (int j = 0; j < array.length; ++j) {
                if (array[j] > 0) {
                    GradeRange2[i][j + index]++;
                    array[j]--;
                }
                index--;
            }
        }

        for (int i = 0; i <= Max_array; ++i) {
            for (int j = 0; j < array.length; ++j) {
                if (GradeRange2[i][j] > 0) {
                    System.out.print(" * ");
                } else if (i == Max_array) {
                    System.out.printf("%2d - %2d ", firstNum, lastNum);
                    firstNum += 10;
                    if (lastNum == 89) {
                        lastNum += 11;
                    } else {
                        lastNum += 10;
                    }
                } else if (GradeRange2[i][j] == 0) {
                    System.out.print("   ");
                }
            }
            System.out.println("");
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
                
                int[] GradeElment = CountGrade(StdGrade);
              
                printHorizontal(GradeElment);
                printVertical(GradeElment);

            } else {
                System.out.println("Error! Try again.");
                isErr_1 = false;
            }
        } while (!isErr_1);
    }
}

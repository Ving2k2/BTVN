import java.util.Arrays;
import java.util.Scanner;

public class GradesHistogram2 {
    public static int[] CountGrade(int[] array) {
        int[] gradeRange = new int[10];

        for (int i = 0; i < array.length; ++i) {
            if (array[i] >= 0 && array[i] <= 9) {
                gradeRange[0]++;
            } else if (array[i] >= 10 && array[i] <= 19) {
                gradeRange[1]++;
            } else if (array[i] >= 20 && array[i] <= 29) {
                gradeRange[2]++;
            } else if (array[i] >= 30 && array[i] <= 39) {
                gradeRange[3]++;
            } else if (array[i] >= 40 && array[i] <= 49) {
                gradeRange[4]++;
            } else if (array[i] >= 50 && array[i] <= 59) {
                gradeRange[5]++;
            } else if (array[i] >= 60 && array[i] <= 69) {
                gradeRange[6]++;
            } else if (array[i] >= 70 && array[i] <= 79) {
                gradeRange[7]++;
            } else if (array[i] >= 80 && array[i] <= 89) {
                gradeRange[8]++;
            } else if (array[i] >= 90 && array[i] <= 100) {
                gradeRange[9]++;
            } 
        }
        return gradeRange;
    }

    public static void printVertical(int[] array) {
        int firstNum = 0;
        int lastNum = 9;

        for (int i = 0; i < array.length; ++i) {
            if  (lastNum == 100) {
                System.out.printf("%2d - %2d:", firstNum, lastNum);
            } else {
                System.out.printf("%2d - %2d: ", firstNum, lastNum);
            }

            firstNum += 10;
            if (lastNum == 89) {
                lastNum += 11;
            } else {
                lastNum += 10;
            }
            
            for (int starNo = 0; starNo < array[i]; ++starNo) {
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
        int[] copyOfArray = Arrays.copyOf(array,array.length);
        int maxGr = findMax(copyOfArray);

        String [][] horizontalHist = new String [maxGr][10];
        for (int i = maxGr - 1; i >= 0; i--) {
            for (int j = 9; j >= 0; j--) {
                if (copyOfArray[j] != 0) {
                    horizontalHist[i][j] = "   *   ";
                    copyOfArray[j]--;
                } else {
                    horizontalHist[i][j] = "       ";
                }
            }
        }
        for (int i = 0; i < maxGr; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(horizontalHist[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i <= 9; i++) {
            if (i == 0) {
                System.out.print("  0-9   ");
            } else if (i == 9) {
                System.out.println("90-100");
            } else {
                System.out.print((i * 10) + "-" + (i * 10 + 9) + "  ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean isErr1 = false;
        boolean isErr2 = false;
        
        do {
            System.out.print("Enter the number of students: ");
            int numStd = scanner.nextInt();
    
            int[] stdGrade = new int[numStd];
            
            if (stdGrade.length <= 100) {
                isErr1 = true;
                for (int i = 1; i <= numStd; ++i) {
                    isErr2 = false;
                    do {
                        System.out.print("Enter the grade (between 0 and 100) for student " + i + " : ");
                        stdGrade[i-1] = scanner.nextInt();
                        if (stdGrade[i-1] > 0 && stdGrade[i-1] < 100) {
                            isErr2 = true;
                        } else {
                            System.out.println("Error! Please try again"); 
                        }     
                    } while (!isErr2);
                }
                
                scanner.close();
                
                int[] gradeElment = CountGrade(stdGrade);
              
                printHorizontal(gradeElment);
                printVertical(gradeElment);
            } else {
                System.out.println("Error! Try again.");
                isErr1 = false;
            }
        } while (!isErr1);
    }
}

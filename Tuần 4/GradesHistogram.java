import java.util.Scanner;

public class GradesHistogram {
    public static int [] grades;
    public static void main(String[] args) {
         readGrades();
         displayHorizontalHist(grades);
         displayVerticalHist(grades);
    }
    public static void readGrades() {
        Scanner scanner = new Scanner(System.in);
        grades = new int [10];

        for (int i = 0; i < 9; i++) {
            System.out.print("Enter the frequency of grade " + (i*10) + " - " + (i*10+9) + ": ");
            grades[i] = scanner.nextInt();
        }
        System.out.print("Enter the frequency of grade " + "90 - 100" + ": ");
        grades[9] = scanner.nextInt();
        
        scanner.close();
    }

    public static void displayHorizontalHist(int [] grades) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d %s %3d %s", (i*10), " - ", (i*10+9), ": ");
            for (int numOfStars = 0; numOfStars < grades[i]; numOfStars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.printf("%2d %s %3d %s", 90, " - ", 100, ": ");
        for (int numOfStars = 0; numOfStars < grades[9]; numOfStars++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void displayVerticalHist(int [] grades) {
        int max = grades[0];
        for (int i = 0; i < 10; i++) {
            max = Math.max(max, grades[i]);
        }
        String [][] verticalHist = new String [max][10];
        for (int i = max - 1; i >= 0; i--) {
            for (int j = 9; j >= 0; j--) {
                if (grades[j] != 0) {
                    verticalHist[i][j] = "   *   ";
                    grades[j]--;
                } else {
                    verticalHist[i][j] = "       ";
                }
            }
        }
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(verticalHist[i][j]);
            }
            System.out.println();
        }
        System.out.print("  0-9   ");
        for (int i = 1; i < 9; i++) {
            System.out.print((i*10) + "-" + (i*10 + 9) + "  ");
        }
        System.out.print("90-100 ");
    }
}
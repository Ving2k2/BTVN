import java.util.Scanner;

public class GradesHistogram {
    public static int [] Grades;
    public static void main(String[] args) {
         readGrades();
         displayVerticalHist(Grades);
         displayHorizontalHist(Grades);
    }
    public static void readGrades() {
        Scanner sc = new Scanner(System.in);
        Grades = new int [10];

        for (int i = 0; i <= 9; i++) {
            System.out.print("Enter the frequency of grade " + (i * 10) + " - " + (i * 10 + 9) + ": ");
            Grades[i] = sc.nextInt();
            if (i == 9) {
                System.out.print("Enter the frequency of grade " + "90 - 100" + ": ");
                Grades[9] = sc.nextInt();
            }
        }
        
        sc.close();
    }

    public static void displayVerticalHist(int [] array) {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d %s %3d %s", (i * 10), " - ", (i * 10 + 9), ": ");
            for (int numOfStars = 0; numOfStars < array[i]; numOfStars++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.printf("%2d %s %3d %s", 90, " - ", 100, ": ");
        for (int numOfStars = 0; numOfStars < array[9]; numOfStars++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void displayHorizontalHist(int [] array) {
        int maxGr = array[0];
        for (int i = 0; i < 10; i++) {
            maxGr = Math.max(maxGr, array[i]);
        }
        String [][] horizontalHist = new String [maxGr][10];
        for (int i = maxGr - 1; i >= 0; i--) {
            for (int j = 9; j >= 0; j--) {
                if (array[j] != 0) {
                    horizontalHist[i][j] = "   *   ";
                    array[j]--;
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
        System.out.print("  0-9   ");
        for (int i = 1; i < 9; i++) {
            System.out.print((i * 10) + "-" + (i * 10 + 9) + "  ");
        }
        System.out.println("90-100");
    }
}
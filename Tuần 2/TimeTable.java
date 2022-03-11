import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = scanner.nextInt();

        scanner.close();

        //loop
        for (int row = 1; row <= size + 2; row++) {
            for (int col = 1; col <= size + 1; col++) {
                if (row == 1 && col == 1) {
                    System.out.printf("   * |");
                } else if (col != 1 && row == 1) {
                    System.out.printf(" %4d" ,(col - 1));
                } else if (row != 1 && col == 1 && row != 2) {
                    System.out.printf("%4d |",(row-2));
                } else if (row == 2) {
                    System.out.print("-- --");
                } else {
                    int num = (row - 2) * (col - 1);
                    System.out.printf(" %4d",num);
                }
            }
            System.out.println("");
        }
    }
}

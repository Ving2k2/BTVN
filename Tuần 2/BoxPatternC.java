import java.util.Scanner;

public class BoxPatternC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = scanner.nextInt();

        scanner.close();

        //loop
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == (size - row + 1) || row == 1 || row == size) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}

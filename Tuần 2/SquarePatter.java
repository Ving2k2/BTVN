import java.util.Scanner;

public class SquarePatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = scanner.nextInt();

        scanner.close();

        //loop
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println("");
        }
    }
}

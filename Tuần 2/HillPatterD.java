import java.util.Scanner;

public class HillPatterD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the rows : ");
        int numRow = scanner.nextInt();

        scanner.close();

        //loop
        for (int row = 1; row <= numRow - 1; row++) {
            int numCol = 2 * numRow - 1 ;
            for (int col = 1; col <= numCol; col++) {
                if((row + col >= numRow + 2) && (row >= col - numRow + 2)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println("");
        }

        for (int row = numRow; row >= 1; row--) {
            int numCol = 2 * numRow - 1;
            for (int col = numCol; col >= 1; col--) {
                if((row + col >= numRow + 2) && (row >= col - numRow + 2)) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println("");
        }
    }
    
}

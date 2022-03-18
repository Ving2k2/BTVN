import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int numItem = scanner.nextInt();

        int[] items = new int[numItem];

        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < numItem; ++i) {
                items[i] = scanner.nextInt();
            }

            scanner.close();
        
            for (int i = 0; i < numItem; ++i) {
                if (i == 0) {
                    System.out.print("[" + items[i] + ", ");
                } else if (i == (numItem - 1)) {
                    System.out.println(items[i] + "]");
                } else {
                    System.out.print(items[i] + ", ");
                }
            }
        } else {
            System.out.println("The array not exist");
        }
    }
}

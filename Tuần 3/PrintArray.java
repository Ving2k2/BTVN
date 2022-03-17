import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int NumItem = scanner.nextInt();

        int[] Items = new int[NumItem];

        if (Items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < NumItem; ++i) {
                Items[i] = scanner.nextInt();
            }

            scanner.close();
        
            for (int i = 0; i < NumItem; ++i) {
                if (i == 0) {
                    System.out.print("[" + Items[i] + ", ");
                } else if (i == (NumItem - 1)) {
                    System.out.println(Items[i] + "]");
                } else {
                    System.out.print(Items[i] + ", ");
                }
            }
        } else {
            System.out.println("The array not exist");
        }
    }
}

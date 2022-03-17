import java.util.Scanner;

public class PrintArrayInStars {
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
                System.out.print(i + ": ");
                for (int starNo = 1; starNo <= Items[i]; ++starNo) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else {
            System.out.println("The array not exist");
        }
    }
}

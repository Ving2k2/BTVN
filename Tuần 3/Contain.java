import java.util.Scanner;

public class Contain {
    public static boolean contain(int[] array, int num) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int NumItem = scanner.nextInt();

        int[] Items = new int[NumItem];
        int Number;

        if (Items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < NumItem; ++i) {
                Items[i] = scanner.nextInt();
            }

            System.out.print("Enter the contained number: ");
            Number = scanner.nextInt();
            
            scanner.close();

            System.out.println(contain(Items, Number));
        } else {
            System.out.println("The array is empty!");
        }
    }
}

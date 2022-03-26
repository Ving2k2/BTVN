import java.util.Scanner;

public class LinerSearch {
    public static boolean linearSearch(int[] array, int key) {
        for (int idx = 0; idx < array.length; ++idx) {
            if (array[idx] == key) {
                return true;
            }
        }
        return false;
    }

    public  static int linearSearchIndex(int[] array, int key) {
        for (int idx = 0; idx < array.length; ++idx) {
            if (array[idx] == key) {
                return idx;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int length = scanner.nextInt();

        System.out.print("Enter the array: ");
        int[] items = new int[length];
        for (int i = 0; i < length; ++i) {
            items[i] = scanner.nextInt();
        }

        System.out.print("Enter the key: ");
        int key = scanner.nextInt();

        scanner.close();

        if (linearSearch(items,key)) {
            System.out.println("The index of key in array is: "
                               + linearSearchIndex(items,key));
        } else {
            System.out.println("There is no key in array!");
        }
    }
}

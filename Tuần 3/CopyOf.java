import java.util.Scanner;

public class CopyOf {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            } else if (i == (array.length - 1)) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
    
    public static int[] copyOf(int[] array) {
        int[] copyArray = new int[array.length];
        
        for (int i = 0; i < array.length; ++i) {
            copyArray[i] = array[i];
        }
        return copyArray;
    }
    
    public static int[] copyOf(int[] array, int newLength) {
        int[] copyArray = new int[newLength];

        for (int i = 0; i < newLength; ++i) {
            if (i < array.length) {
                copyArray[i] = array[i];
            } else {
                copyArray[i] = 0;
            }
        }
        return copyArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int numItem = scanner.nextInt(); 

        int[] items = new int[numItem]; 
        
        System.out.print("Enter the value of all items (separated by space): ");
        for (int i = 0; i < numItem; ++i) {
            items[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the length of copied array: ");
        int length = scanner.nextInt();

        scanner.close();

        print(copyOf(items));
        print(copyOf(items, length));
    }
}

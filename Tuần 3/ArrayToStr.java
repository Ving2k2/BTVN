import java.util.Scanner;

public class ArrayToStr {
    public static String ArrayToString(int[] array) {
        String inStr = "";
        
        for (int i = 0; i < array.length; ++i) {
            if (i == 0) {
                inStr += "[" + array[i] + ", ";
            } else if (i == (array.length - 1)) {
                inStr += array[i] + "]";
            } else {
                inStr += array[i] + ", ";
            }
        }
        return inStr;
    }
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

            System.out.println(ArrayToString(items));
        } else {
            System.out.println("The array is empty!");
        }
    }
}

import java.util.Scanner;

public class ArrayToStr {
    public static String arrayToString(int[] array) {
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
        int NumItem = scanner.nextInt();

        int[] Items = new int[NumItem];
        
        if (Items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < NumItem; ++i) {
                Items[i] = scanner.nextInt();
            }

            scanner.close();

            System.out.println(arrayToString(Items));
        } else {
            System.out.println("The array is empty!");
        }
    }
}

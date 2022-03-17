import java.util.Scanner;

public class Swap {
    public static boolean swap(int[] array_1, int[] array_2) {
        int item1 = 0;
        int item2 = 0;
        int temp = 0;
        
        if (array_1.length == array_2.length) {
            for (int i = 0; i < array_1.length; ++i) {
                temp = item1;
                item1 = item2;
                item2 = temp;
            }
        } else {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items of 1st array: ");
        int NumItem_1 = scanner.nextInt(); 
        int[] Array_1st = new int[NumItem_1]; 

        System.out.print("Enter the number of items of 2nd array: ");
        int NumItem_2 = scanner.nextInt(); 
        int[] Array_2nd = new int[NumItem_2]; 
        
        if (NumItem_1 > 0 && NumItem_2 > 0) {
            System.out.print("Enter the value of all items of 1st array (separated by space): ");
            for (int i = 0; i < NumItem_1; ++i) {
                Array_1st[i] = scanner.nextInt();
            }

            System.out.print("Enter the value of all items of 2nd array (separated by space): ");
            for (int i = 0; i < NumItem_2; ++i) {
                Array_2nd[i] = scanner.nextInt();
            }

            scanner.close();

            System.out.println(swap(Array_1st, Array_2nd));
        } else {
            System.out.println(swap(Array_1st, Array_2nd));
        } 
    }
}

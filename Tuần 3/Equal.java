import java.util.Scanner;

public class Equal {
    public static boolean equals(int[] array_1, int[] array_2) {
        if (array_1.length == array_2.length) {
            for (int i = 0; i < array_1.length; ++i) {
                if (array_1[i] != array_2[i]) {
                    return false;
                }
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
        int[] Items_1st = new int[NumItem_1]; 

        System.out.print("Enter the number of items of 2nd array: ");
        int NumItem_2 = scanner.nextInt(); 
        int[] Items_2nd = new int[NumItem_2]; 
        
        if (NumItem_1 > 0 && NumItem_2 > 0) {
            System.out.print("Enter the value of all items of 1st array (separated by space): ");
            for (int i = 0; i < NumItem_1; ++i) {
                Items_1st[i] = scanner.nextInt();
            }

            System.out.print("Enter the value of all items of 2nd array (separated by space): ");
            for (int i = 0; i < NumItem_2; ++i) {
                Items_2nd[i] = scanner.nextInt();
            }

            scanner.close();

            System.out.println(equals(Items_1st, Items_2nd));
        } else {
            System.out.println(equals(Items_1st, Items_2nd));
        } 
    }
}

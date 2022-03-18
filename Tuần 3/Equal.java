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
        int numItem1 = scanner.nextInt(); 
        int[] array1st = new int[numItem1]; 

        System.out.print("Enter the number of items of 2nd array: ");
        int numItem2 = scanner.nextInt(); 
        int[] array2nd = new int[numItem2]; 
        
        if (numItem1 > 0 && numItem2 > 0) {
            System.out.print("Enter the value of all items of 1st array (separated by space): ");
            for (int i = 0; i < numItem1; ++i) {
                array1st[i] = scanner.nextInt();
            }

            System.out.print("Enter the value of all items of 2nd array (separated by space): ");
            for (int i = 0; i < numItem2; ++i) {
                array2nd[i] = scanner.nextInt();
            }

            scanner.close();

            System.out.println(equals(array1st, array2nd));
        } else {
            System.out.println(equals(array1st, array2nd));
        } 
    }
}

import java.util.Scanner;

public class Search {
    public static int search(int[] array, int num) {
        for (int Index = 0; Index < array.length; ++Index) {
            if (array[Index] == num) {
                return Index;
            }
        }
        return -1;
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

            System.out.print("Enter the number to search in array: ");
            int inNum = scanner.nextInt();

            scanner.close();

            System.out.println("The index of " + inNum + " in the array is: (-1 if the number isn't exist) " + search(items, inNum));
        } else {
            System.out.println("The array is empty!");
        }        
    }
}

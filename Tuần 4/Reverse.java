import java.util.Scanner;

public class Reverse {
    public static void reverse(int[] array) {
        int[] newArray = new int[array.length];
        int j = 0;

        for (int i = array.length - 1; i >= 0; --i) {
            newArray[j] = array[i];
            j++;
        }

        for (int i = 0; i < newArray.length; ++i) {
            if (i == 0) {
                System.out.print("[" + newArray[i] + ", ");
            } else if (i == (newArray.length - 1)) {
                System.out.println(newArray[i] + "]");
            } else {
                System.out.print(newArray[i] + ", ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int NumItem = scanner.nextInt(); 

        int[] inArray = new int[NumItem];
        
        if (inArray.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < NumItem; ++i) {
                inArray[i] = scanner.nextInt();
            }

            scanner.close();
            
            reverse(inArray);

        } else {
            System.out.println("The array is empty!");
        }
    }
}

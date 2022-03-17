import java.util.Scanner;

public class Reverse {
    public static void Reverse(int[] array) {
        int[] newArray = new int[array.length];

        for 

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int NumItem = scanner.nextInt(); 

        int[] Array = new int[NumItem]; // float[] double[]
        
        if (Array.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < NumItem; ++i) {
                Array[i] = scanner.nextInt();
            }

            scanner.close();
            
        } else {
            System.out.println("The array is empty!");
        }
    }
}

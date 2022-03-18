import java.util.Scanner;

public class Print {
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

    public static void print(double[] array) {
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

    public static void print(float[] array) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int numItem = scanner.nextInt(); 

        int[] Items = new int[numItem]; // float[] double[]
        
        if (Items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < numItem; ++i) {
                Items[i] = scanner.nextInt();
            }

            scanner.close();

            print(Items);
        } else {
            System.out.println("The array is empty!");
        }
    }
}

import java.util.Scanner;

public class Exponment {
    public static int exponment(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; ++i) {
            result *= base;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base: ");
        int inBase = scanner.nextInt();
        
        System.out.print("Enter the expment: ");
        int inExp = scanner.nextInt();

        scanner.close();

        System.out.println(inBase + " raies to the power of " + inExp + " is : " + exponment(inBase, inExp));
    }
}

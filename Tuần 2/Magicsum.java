import java.util.Scanner;

public class MagicSum {
    public static boolean hasEight(int num) {
        int lastnum = 0;
        boolean ItHasEight = false;
        while (num > 0) {
            lastnum = num % 10;
            if (lastnum = 0 == 8) {
                ItHasEight = true;
                break;
            } else {
                num = num / 10;
            }
        }
        return ItHasEight;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (or -1 to end): ");
        int inNum = scanner.nextInt();

        int sum = 0;
        while (inNum != -1) {
            if (hasEight(inNum)) {
                sum += inNum;
                System.out.print("Enter a positive integer (or -1 to end): ");
                inNum = scanner.nextInt();
            } else {
                System.out.print("Enter a positive integer (or -1 to end): ");
                inNum = scanner.nextInt();
            }
        }
        
        scanner.close();

        System.out.println("The magic sum is: " + sum);
    }
}


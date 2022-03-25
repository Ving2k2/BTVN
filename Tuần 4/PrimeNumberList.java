import java.util.Scanner;

public class PrimeNumberList {
    public static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper bound: ");
        int upperNum = scanner.nextInt();

        scanner.close();

        int count1 = 0;
        System.out.println("These numbers are prime:");
        for (int i = 1; i <= upperNum; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count1++;
            }
        }
        System.out.println();
        double percent1 = (double) count1 / upperNum * 100;
        System.out.printf("[ %d prime numbers found (%.2f%%) ]%n",count1,percent1);
    }
}

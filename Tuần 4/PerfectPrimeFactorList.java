import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public static boolean isProductOfPrimeFactors(int num) {
        int tmp = 1;
        for (int i = 1; i < num; i++) {
            if (isPrime(i) && (num % i == 0)) {
                tmp *= i;
            }
        }
        return tmp == num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper bound: ");
        int upperNum = scanner.nextInt();

        scanner.close();

        int count1 = 0;
        System.out.println("These numbers are are equal to the product of prime factors:");
        for (int i = 1; i <= upperNum; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count1++;
            }
        }
        System.out.println();
        double percent1 = (double) count1 / upperNum * 100;
        System.out.printf("[ %d prime numbers found (%.2f%%) ]%n",count1,percent1);
    }
}

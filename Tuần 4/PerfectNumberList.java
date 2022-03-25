import java.util.Scanner;

public class PerfectNumberList {
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; ++i) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i < num; ++i) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum < num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper bound: ");
        int upperNum = scanner.nextInt();

        scanner.close();

        int count1 = 0;
        System.out.println("These numbers are perfect:");
        for (int i = 1; i <= upperNum; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                count1++;
            }
        }
        System.out.println();
        double percent1 = (double) count1 / upperNum * 100;
        System.out.printf("[%d perfect numbers found (%.2f%%) ]%n",count1,percent1);

        int count2 = 0;
        System.out.println("These numbers are neither deficient nor perfect :");
        for (int i = 1; i <= upperNum; i++) {
            if (!isPerfect(i) && !isDeficient(i)) {
                System.out.print(i + " ");
                count2++;
            }
        }
        System.out.println();
        double percent2 = (double) count2 / upperNum * 100;
        System.out.printf("[ %d numbers found (%.2f%%) ]%n",count2,percent2);


    }
}

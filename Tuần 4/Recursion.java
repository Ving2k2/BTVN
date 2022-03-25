import java.util.Scanner;

public class Recursion {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static int len(int n) {
        int numOfDigits = 0;
        int i = n;

        while (i > 0) {
            i /= 10;
            numOfDigits++;
        }

        if (n < 10) {
            return n;
        } else {
            return len(n - 1) + numOfDigits;
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b,a % b);
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of factorial: ");
        int numFactr= scanner.nextInt();
        System.out.println(factorial(numFactr));

        System.out.print("Enter the number of fibonacci: ");
        int numFib = scanner.nextInt();
        System.out.println(fibonacci(numFib));

        System.out.print("Enter n of num sequence: ");
        int numSeq = scanner.nextInt();
        System.out.println(len(numSeq));

        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.println(gcd(a,b));

        scanner.close();
    }
}

import java.util.Scanner;

public class TrigonometricSeries {
    public static double sin(double x, int numTerm) {
        double result = 0;
        double tempX = 1;
        int denominator = -1;
        double temp = tempX / denominator;


        for (int i = 1; i <= numTerm; ++i) {
            temp *=  x / i;
            if (i % 2 != 0) {
                temp *= -1;
                result += temp;
            }
        }
        return result;
    }

    public static double cos(double x, int numTerm) {
        double result = 1;
        double tempX = 1;
        int denominator = 1;
        double temp = tempX / denominator;

        for (int i = 1; i <= numTerm; ++i) {
            temp *=  x / i;
            if (i % 2 == 0) {
                temp *= -1;
                result += temp;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radian X: ");
        double radianX = scanner.nextDouble();

        System.out.print("Enter the number of terms: ");
        int numOfTerms = scanner.nextInt();

        scanner.close();

        System.out.println(sin(radianX,numOfTerms));
        System.out.println(Math.sin(radianX));

        System.out.println(cos(radianX,numOfTerms));
        System.out.println(Math.cos(radianX));
    }
}

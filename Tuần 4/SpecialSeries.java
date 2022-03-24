import java.util.Scanner;

public class SpecialSeries {
    public static double specialSeries(double x, int numTerms) {
        double result = 0;
        double temp = 1;

        for (int i = 1; i <= numTerms; ++i) {
            temp *=  x;
            if (i % 2 != 0 && i != 1) {
                temp *= (double) (i - 2) / (i - 1);
                result += temp / i;
            } else if (i == 1) {
                result += temp;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double numberX = scanner.nextDouble();

        System.out.print("Enter the number of terms: ");
        int numOfTerms = scanner.nextInt();

        scanner.close();

        System.out.println(specialSeries(numberX,numOfTerms));
    }
}

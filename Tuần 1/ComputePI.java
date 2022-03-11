import java.util.Scanner;

public class ComputePI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of max denominator (Try 1000, 10000, 100000) : " );
        int MAX_DENOMINATOR = scanner.nextInt(); // Try 1000, 10000, 100000
        
        scanner.close();
        
        // Computing sum and pi
        int count = 0;
        double sum = 0;
        for (int i = 1; i <= MAX_DENOMINATOR; i += 2) {
            if (count % 2 == 0) {
                sum += (double) 1/i;
            } else {
                sum -= (double) 1/i;
            }
            ++count;
        }

        double piComputed = 4 * sum;

        // Compare picomputed with Math.pi
        double accuracy = (piComputed/Math.PI) * 100;
        System.out.println("The accuracy of computing PI is " + accuracy);
    }
}

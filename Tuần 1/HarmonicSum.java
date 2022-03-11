public class HarmonicSum {
    public static void main(String[] args) {
        int MAX_DENOMINATOR = 50000;
  
        // Computing sum left to right
        double sumL2R = 0;
        for (int i = 1; i <= MAX_DENOMINATOR; ++i) {
            sumL2R += (double) 1/i;
        }
        System.out.println("The sum from left to right is " + sumL2R);

        // Computing sum right to left
        double sumR2L = 0;
        for (int i = MAX_DENOMINATOR; i >= 1; --i) {
            sumR2L += (double) 1/i;
        }
        System.out.println("The sum from right to left is " + sumR2L);

        // Compute Absolute Diference
        double absDiff = (sumR2L > sumL2R ) ? (sumR2L - sumL2R) : (sumL2R - sumR2L);
        System.out.println("The Diference of two sum is " + absDiff );
    }
}

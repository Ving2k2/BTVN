public class SumAverageRunningIntAndTryExercises {
    public static void main(String[] args) {
        final int lowerbound = 1;
        final int upperbound = 100;

        // Computing sum from lowerbound to upperbound
        int sum1 = 0;
        for (int i = lowerbound; i <= upperbound; ++i) {
            sum1 += i;
        }
        
        // Average
        double average1 = (double) sum1 / 100;

        // Computing sum and averge from 111 to 8899
        int count = 0;
        int sum2 = 0;
        for (int i = 111; i <= 8899; ++i) {
            sum2 += i;
            ++count;
        }
        double average2 = (double) sum2 / count;

        // Computing sum of odd and sum of even with do-while
        int sumOdd = 0;
        int sumEven = 0;
        int num = lowerbound;
        do {
            if (num % 2 == 0) sumEven += num;
            else sumOdd += num;
            ++num;
        } while (num <= upperbound);
        
        // Compute Absolute Diference2
        int absDiff = (sumOdd > sumEven) ? (sumOdd - sumEven) : (sumEven - sumOdd);

        // Sum of squares with while-do loop
        int sumSqr = 0;
        while (num <= upperbound) {
        sumSqr += (num * num);
        ++num;
        }
        
        // Print
        System.out.println("The sum of " + lowerbound + " to " + upperbound + " is " + sum1);
        System.out.println("The averge is " + average1);
        System.out.println("The sum of  111  to 8899 is " + sum2);
        System.out.println("The averge is " + average2);
        System.out.println("The sum of the squares " + lowerbound + " to " + upperbound + " is " + sumSqr);
        System.out.println("The sum of odd numbers from " + lowerbound + " to " + upperbound + " is " + sumOdd);
        System.out.println("The sum of even numbers from " + lowerbound + " to " + upperbound + " is " + sumEven);
        System.out.println("The Absolute Diference of sum of odd numbers and sum of even nummbers from " + lowerbound + " to " + upperbound + " is " + absDiff);
    }
}

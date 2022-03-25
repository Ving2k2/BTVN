public class FactorialInt {
    public static void factorialInt() {
        int factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            System.out.println("The factorial of " + i +  " is " + factorial);
            i++;
        } while ((Integer.MAX_VALUE / factorial) > (i+1));

        System.out.println("The factorial of " + i + " is out of range");
    }

    public static void factorialLong() {
        long factorial = 1;
        long i = 1;

        do {
            factorial *= i;
            System.out.println("The factorial of " + i +  " is " + factorial);
            i++;
        } while ((Long.MAX_VALUE / factorial) > (i+1));

        System.out.println("The factorial of " + i + " is out of range");
    }
    public static void main(String[] args) {
        factorialInt();
        System.out.println();
        factorialLong();
    }
}

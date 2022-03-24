public class FactorialInt {
    public static void main(String[] args) {
        int factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            System.out.println("The factorial of " + i +  " is " + factorial);
            i++;
        } while ((Integer.MAX_VALUE / factorial) > (i+1));

        System.out.println("The factorial of " + i + " is out of range");
    }
}

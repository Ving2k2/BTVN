public class FibonacciInt {
    public static void main(String[] args) {
        int fn1 = 1;
        int fn2 = 1;
        int fn;
        int n = 3;

        do {
            fn = fn1 + fn2;
            System.out.println("F(" + n + ") = " + fn);
            fn1 = fn2;
            fn2 = fn;
            n++;
        } while (Integer.MAX_VALUE - fn1 >= fn2);
        System.out.println("F(" + n + ") is out of range");

    }
}

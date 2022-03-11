public class Fibonacci {
    public static void main(String[] args) {
        int fn_1 = 1;
        int fn_2 = 1;
        System.out.println("The frist 20 Fibonacci numbers are :");
        System.out.print(fn_1 + " " + fn_2 + " ");
        
        int fn;
        int n = 3;
        int sum = fn_1 + fn_2;
        while (n <= 20) {
            fn = fn_1 + fn_2;
            sum += fn;
            System.out.print(fn + " ");
            ++n;
            fn_1 = fn_2;
            fn_2 = fn;
        }
        System.out.println(" ");

        double averge = (double) sum / 20;
        System.out.println("The averge is : " + averge);
    }
}

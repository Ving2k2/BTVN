public class Tribonacci {
    public static void main(String[] args) {
        int fn_1 = 1;
        int fn_2 = 1;
        int fn_3 = 2;
        System.out.println("The frist 20 Tribonacci numbers are :");
        System.out.print(fn_1 + " " + fn_2 + " " + fn_3 + " ");
        
        int fn;
        int n = 4;
        int sum = fn_1 + fn_2 + fn_3;
        while (n <= 20) {
            fn = fn_1 + fn_2 + fn_3;
            sum += fn;
            System.out.print(fn + " ");
            ++n;
            fn_1 = fn_2;
            fn_2 = fn_3;
            fn_3 = fn;
        }
        System.out.println(" ");

        double averge = (double) sum / 20;
        System.out.println("The averge is : " + averge);
    }
}

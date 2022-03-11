import java.util.Scanner;

public class SumProductMinMax5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter 1st number : ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter 2nd number : ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter 3rd number : ");
        int num3 = scanner.nextInt();
        
        System.out.print("Enter 4th number : ");
        int num4 = scanner.nextInt();
        
        System.out.print("Enter 5th number : ");
        int num5 = scanner.nextInt();
        
        scanner.close();
        
        // Print sum and product
        System.out.println("The sum is : " + (num1 + num2 + num3 + num4 + num5));
        System.out.println("The product is : " + (num1 * num2 * num3 * num4 * num5));

        // Find min and max
        int min = num1;
        if (num2 < min) {
            min = num2;
        } 
        if (num3 < min) {
            min = num3;
        } 
        if (num4 < min) {
            min = num4;
        } 
        if (num5 < min) {
            min = num5;
        }
        System.out.println("The min numbers is : " + min);

        int max = num1;
        if (max < num2) {
            max = num2;
        } 
        if (max < num3) {
            max = num3;
        } 
        if (max < num4) {
            max = num4;
        } 
        if (max < num5) {
            max = num5;
        }
        System.out.println("The max number is : " + max);
    }
}

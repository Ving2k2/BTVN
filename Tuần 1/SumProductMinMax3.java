import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter 1st number : ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter 2nd number : ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter 3rd number : ");
        int num3 = scanner.nextInt();
        
        scanner.close();
        
        // Print sum and product
        System.out.println("The sum is : " + (num1 + num2 + num3));
        System.out.println("The product is : " + (num1 * num2 * num3));

        // Find min and max
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        System.out.println("The min numbers is : " + min);

        int max = num1;
        if (max < num2) {
            max = num2;
        } 
        if (max < num3) {
            max = num3;
        }
        System.out.println("The max number is : " + max);
    }
}

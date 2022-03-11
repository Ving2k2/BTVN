import java.util.Scanner;

public class CricleComputation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radious : ");
        double radious = scanner.nextDouble();
        
        scanner.close();

        // computing and print diameter, area, circumference
        double diameter = radious * 2;
        System.out.printf("Diameter is : %.2f%n", diameter);

        double area = Math.PI * radious * radious;
        System.out.printf("Area is : %.2f%n", area);

        double circumference = Math.PI * radious * 2;
        System.out.printf("Circumference is : %.2f%n", circumference);

    }
}

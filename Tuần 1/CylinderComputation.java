import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radious : ");
        double radious = scanner.nextDouble();
        
        System.out.print("Enter the height : ");
        double height = scanner.nextDouble();
        
        scanner.close();

        // computing and print base area, surface area, volume
        double baseArea = Math.PI * radious * radious;
        System.out.printf("Base area is : %.2f%n", baseArea);
        
        double surfaceArea = 2 * radious * Math.PI + 2 * baseArea;
        System.out.printf("Surface area is : %.2f%n", surfaceArea);

        double volume = baseArea * height;
        System.out.printf("Volume is : %.2f%n", volume);

    }
}

import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radious : ");
        double radious = scanner.nextDouble();
        
        scanner.close();

        // computing and print surface area, volume
        double surfaceArea = 4 * radious * radious * Math.PI;
        System.out.printf("Surface area is : %.2f%n", surfaceArea);

        double volume = (double) 4/3 * Math.PI * radious * radious * radious ; // nếu không có (double) thì 4/3 sẽ trả về giá trị int 4/3 = 1
        System.out.printf("Volume is : %.2f%n", volume);
    }
}

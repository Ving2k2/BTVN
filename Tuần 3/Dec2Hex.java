import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int inNum = scanner.nextInt();

        scanner.close();

        int index = 0;
        String hexString = "";
        char hexChars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
        
        while (inNum > 0) {
            index = inNum % 16;
            hexString += hexChars[index];
            inNum /= 16;
        }

        StringBuilder str = new StringBuilder(hexString);
        System.out.println("The equivalent hexadecimal number is: " + str.reverse());
    }
}

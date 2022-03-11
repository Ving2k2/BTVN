import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a plaintext string: " );
        String inStr = scanner.next().toUpperCase();

        scanner.close();

        //loop and print
        String CipherStr = "";
        int inStrLen = inStr.length();
        System.out.print("The ciphertext string is: ");
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            if (inStr.charAt(charIdx) == 'X') {
                System.out.print('A');
            } else if (inStr.charAt(charIdx) == 'Y') {
                System.out.print('B');
            } else if (inStr.charAt(charIdx) == 'Z') {
                System.out.print('C');
            } else {
                char FakeChar = (char) (inStr.charAt(charIdx) + 3);
                CipherStr += FakeChar;
            }
        }
        System.out.println("The ciphertext string is: " + CipherStr);
    }
}

import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the palintext string: ");
        String inStr = scanner.next().toUpperCase();
        
        scanner.close();

        //loop and print
        String cipherStr = "";
        int inStrLen = inStr.length();

        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            char fakeChar = (char) ('A' + 'Z' - inStr.charAt(charIdx));
            cipherStr += fakeChar;
        }
        System.out.println("The cliphertext string is: " + cipherStr);
    }
}

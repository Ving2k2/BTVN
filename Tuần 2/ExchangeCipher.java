import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the palintext string: ");
        String inStr = scanner.next().toUpperCase();
        
        scanner.close();

        //loop and print
        String CipherStr = "";
        int inStrLen = inStr.length();
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            char FakeChar = (char) ('A' + 'Z' - inStr.charAt(charIdx));
            CipherStr += FakeChar;
        }
        System.out.println("The cliphertext string is: " + CipherStr);
    }
}

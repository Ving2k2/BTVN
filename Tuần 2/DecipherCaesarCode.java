import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a ciphertext string: ");
        String inStr = scanner.next().toUpperCase();

        scanner.close();

        //loop and print
        String PlainStr = "";
        int inStrLen = inStr.length();
        System.out.print("The plaintext string is: ");
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            if (inStr.charAt(charIdx) == 'A') {
                System.out.print('X');
            } else if (inStr.charAt(charIdx) == 'B') {
                System.out.print('Y');
            } else if (inStr.charAt(charIdx) == 'C') {
                System.out.print('Z');
            } else {
                char RealChar = (char) (inStr.charAt(charIdx) - 3);
                PlainStr += RealChar;
            }
        }
        System.out.println("The plaintext string is: " + PlainStr);
    }
}


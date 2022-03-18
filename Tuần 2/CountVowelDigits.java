import java.util.Scanner;

public class CountVowelDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String inStr = scanner.next().toLowerCase();

        scanner.close();

        //loop
        int countOfDigit = 0;
        int countOfVowel = 0;
        int inStrLen = inStr.length();
        
        for (int charIdx = 0; charIdx < inStrLen; ++charIdx) {
            if (Character.isDigit(inStr.charAt(charIdx))) {
                countOfDigit++;
            } else if (inStr.charAt(charIdx) == 'a' || inStr.charAt(charIdx) == 'o' || 
                       inStr.charAt(charIdx) == 'e' || inStr.charAt(charIdx) == 'i') {
                           countOfVowel++;
                       }
        }
        //computing and print
        double PerOfVowel = (double) countOfVowel / inStrLen * 100;
        System.out.printf("Number of vowels : %d (%.2f%%)%n",countOfVowel,PerOfVowel);

        double PerOfDigit = (double)  countOfDigit / inStrLen * 100;
        System.out.printf("Number of digits : %d (%.2f%%)%n",countOfDigit,PerOfDigit);

    }
}

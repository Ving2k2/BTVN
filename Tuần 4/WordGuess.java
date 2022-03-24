import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        final String[] SECRET_WORD_LIST = {"Test","Have","Comparable","Math"};
        final String SECRET_WORD = SECRET_WORD_LIST[(int) (Math.random() * SECRET_WORD_LIST.length)].toLowerCase();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Java WordGuess");

        boolean[] charChecked = new boolean[SECRET_WORD.length()];
        int count = 1;
        int numCorrect = 0;
        boolean guessTrue = false;
        do {
            System.out.print("Key in one character or your guess word: ");
            String guessStr = scanner.next();

            if (Objects.equals(guessStr, SECRET_WORD)) {
                System.out.println("Congratulation!");
                System.out.println("You got in " + count + " trials");
                guessTrue = true;
            } else if (guessStr.length() == 1) {
                for (int i = 0; i < SECRET_WORD.length(); ++i) {
                    if (SECRET_WORD.charAt(i) == guessStr.charAt(0)) {
                        charChecked[i] = true;
                        numCorrect++;
                        count++;
                    }
                }

                System.out.print("Trial " + count+ ": ");
                for (int idx = 0; idx < SECRET_WORD.length(); idx++) {
                    if (charChecked[idx]) {
                        System.out.print(SECRET_WORD.charAt(idx));
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println();

                if (numCorrect == SECRET_WORD.length()) {
                    System.out.println("Congratulation!");
                    System.out.println("You got in " + count + " trials");
                    guessTrue = true;
                }
            }
        } while (!guessTrue);

        scanner.close();
    }
}

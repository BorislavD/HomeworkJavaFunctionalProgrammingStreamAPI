import java.util.Scanner;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine().toLowerCase();
        String str = console.nextLine();
        int strLength = str.length();
        int counter = 0;

        for (int i = 0; i <= userInput.length() - strLength; i++) {
            if (str.equals(userInput.substring(i, strLength + i))) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}

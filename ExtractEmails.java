import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner console = new Scanner((System.in));
        String userInput = console.nextLine();
        Pattern pat = Pattern.compile("([a-z.\\-_\\d]+)@([a-z]+).([a-z]+)(\\.[a-z-]+)+");
        Matcher matcher = pat.matcher(userInput);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

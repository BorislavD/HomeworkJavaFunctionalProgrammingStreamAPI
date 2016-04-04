
import java.util.Arrays;
import java.util.Scanner;

public class FilterArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine();
        String[] arr = userInput.split("\\s+");

        Arrays.stream(arr)
                .filter(p -> p.length() > 3)
                .forEach(e -> {
                    System.out.print(e + " ");
                });
    }
}

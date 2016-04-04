import java.util.Arrays;
import java.util.Scanner;

public class SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine();
        String[] arr = userInput.split("\\s+");
        console.nextLine();
        String command = console.nextLine();
        if(command.equals("Ascending")) {
            Arrays.stream(arr)
                    .sorted()
                    .forEach(e -> {
                        System.out.print(e + " ");
                    });
        } else{
            Arrays.stream(arr)
                    .sorted((el1, el2) -> el2.compareTo(el1))
                    .forEach(e -> {
                System.out.print(e + " ");
            });

        }
    }
}



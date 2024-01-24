import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String phrase = scanner.nextLine();

            // Check for an empty line and break out of the loop
            if (phrase.equals("")) {
                break;
            }

            String[] pieces = phrase.split(" ");

            // Print each piece of the string on a new line
            for (String piece : pieces) {
                System.out.println(piece);
            }

           // System.out.println(); // Print an empty line after each phrase
        }

    }
}


import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String word = scanner.nextLine();
            
            String [] pieces = word.split(" ");
            if(word.equals("")){
                break;
            }
            System.out.println(pieces[pieces.length-1]);
        }

    }
}

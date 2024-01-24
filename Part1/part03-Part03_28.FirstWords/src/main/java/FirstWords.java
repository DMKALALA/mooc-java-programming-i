
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String words = scanner.nextLine();
            if(words.equals("")){
                break;
            }
            
            String [] pieces = words.split(" ");
            for(String text:pieces){
                if(text == pieces[0]){
                    System.out.println(pieces[0]);
                }
            }
            //System.out.println();
        }

    }
}

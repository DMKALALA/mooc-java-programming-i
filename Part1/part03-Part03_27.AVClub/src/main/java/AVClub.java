
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String words = scanner.nextLine();
           
            if(words.equals("")){
                break;
            }
            String [] pieces = words.split(" ");
            
            for(String text:pieces){
                if(text.contains("av")){
                    System.out.println(text);
                }
            }
        }

    }
}

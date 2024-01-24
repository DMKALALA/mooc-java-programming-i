
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumOfWords = 0;
        while(true){
            String words  = scanner.nextLine();
            if(words.equals("end")){
                break;
            }
            
            sumOfWords ++;
            
        }
        
        System.out.println(sumOfWords);
    }
}

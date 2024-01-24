
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest =0;
        while(true){
            String word = scanner.nextLine();
            
            String [] pieces = word.split(",");
            if(word.equals("")){
                break ;
            }
            
            
            int age = Integer.valueOf(pieces[1]);
            
            if(age > oldest){
                oldest=age;
            }
            
            
        }
        System.out.printf("Age of the oldest: %d", oldest);
    }
}

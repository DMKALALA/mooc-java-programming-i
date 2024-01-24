
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest =0;
        String name = " ";
        while(true){
            String word = scanner.nextLine();
            
            String [] pieces = word.split(",");
            if(word.equals("")){
                break ;
            }
            
            
            int age = Integer.valueOf(pieces[1]);
            String names = pieces[0];
            if(age > oldest){
                oldest=age;
                name = names;
            }
            
            
        }
        System.out.printf("Name of the oldest: %s", name);
       
    }
}


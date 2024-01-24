
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        
        while(true){
            String command = in.nextLine();
            
            
            if(command.equals("end")){
                break;
            }
            int number =Integer.parseInt(command);
            number = (int) Math.pow(number, 3);
           
            System.out.println(number);
            
        }
    }
}

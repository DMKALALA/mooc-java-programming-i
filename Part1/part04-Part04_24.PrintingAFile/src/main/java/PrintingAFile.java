
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(Paths.get("data.txt"))){
        
            while(in.hasNextLine()){
                String row = in.nextLine();
                
                System.out.println(row);
            }
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
            
            
    }
}

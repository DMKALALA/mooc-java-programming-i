
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fileName = SafeInput.getNonZeroLenString(in, "Which file should have its contents printed?");
        
        try(Scanner read = new Scanner(Paths.get(fileName))){
            
            while(read.hasNextLine()){
                String row = read.nextLine();
                System.out.println(row);
            }
        
        }catch (Exception e){
            System.out.println("Error" + e.getMessage());
        }
    }
}

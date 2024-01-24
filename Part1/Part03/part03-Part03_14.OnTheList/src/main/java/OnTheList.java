
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = in.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        String search = in.nextLine();
        
        
            
        if(list.contains(search)){
            System.out.printf("%s was found!",search);
        }else{
            System.out.printf("%s was not found!",search);
        }
        
    }
}

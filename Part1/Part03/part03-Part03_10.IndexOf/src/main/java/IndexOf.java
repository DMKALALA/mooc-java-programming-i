
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(in.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        
        System.out.println("Search for? ");
        int valueSearched = in.nextInt();
        
        for(int i = 0; i<list.size();i++){
            
            if(list.get(i) == valueSearched ){
                
                System.out.printf("%d is at index %d%n",valueSearched,i );
            
            }
        
        }
    }
}

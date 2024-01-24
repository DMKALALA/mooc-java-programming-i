
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int insertion = in.nextInt();
            if(insertion == 9999){
                break;
            }
            
            list.add(insertion);
        
        
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        int smallestNumber = list.get(0);
        int smallestNumberIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallestNumber) {
                smallestNumber = list.get(i);
                smallestNumberIndex = i;
            }
        }

        System.out.printf("Smallest number: %d%n", smallestNumber);
        System.out.printf("Found at index: %d%n", smallestNumberIndex);
    }
        
        
    
}

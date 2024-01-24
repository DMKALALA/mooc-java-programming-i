
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(list,0,5);
        
        System.out.println("The numbers in the range [10, 50]");
        printNumbersInRange(list,10,50);
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        boolean foundInRange = false;
        for (int number: numbers) {
            
            if (lowerLimit<=number && number<=upperLimit) {
                System.out.println(number);
                foundInRange = true;
            }
            
            
        }
        if(!foundInRange){
            System.out.println("None");  
        }
        
    }
}

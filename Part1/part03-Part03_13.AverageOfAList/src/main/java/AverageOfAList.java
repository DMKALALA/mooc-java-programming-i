
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            
            
            int numbers = in.nextInt();
            if(numbers == -1){
                break;
            }
            list.add(numbers);
        }
        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = 0;
        for (int value : list) {
            sum += value;
        }
        
        double average = (double) sum / list.size();
        System.out.printf("Average: %f%n", average);
        
    }
}


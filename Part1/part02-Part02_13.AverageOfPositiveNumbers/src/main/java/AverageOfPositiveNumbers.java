
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveNumbers = 0;
        int total = 0;
        double average = 0;
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }else if(num > 0){
                positiveNumbers++;
                total += num;
                
            }
            //System.out.println("Cannot calculate the average");
        }
        if(positiveNumbers == 0){
            System.out.println("Cannot calculate the average");
        }else{
            average = (double) total / positiveNumbers;   
            System.out.println(average);
        }

    }
}

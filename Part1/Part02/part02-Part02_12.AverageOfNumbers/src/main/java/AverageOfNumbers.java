
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int result = 0;
        double average = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }
            numbers ++;
            result += num;   
        }
        average = (double)result/numbers;
        System.out.println("Average of the numbers: " + average);
    }
}

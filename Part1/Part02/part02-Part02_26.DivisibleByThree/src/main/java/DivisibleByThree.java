
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("print");
        int start = Integer.valueOf(scanner.nextLine());
//        System.out.println("print");
        int end = Integer.valueOf(scanner.nextLine());
        
        divisibleByThreeInRange(start,end);
    }
    public static void divisibleByThreeInRange(int beginning, int end){
        
        int range = beginning;
        while((range>=beginning && range<=end )){
            
            if(range%3==0){
                System.out.println(range);  
            }
            range++;
        }
    }
}
//hat prints all the numbers divisible by three in the given range. 
//The numbers are to be printed in order from the smallest to the greatest.
//
//public static void main(String[] args) {
//    divisibleByThreeInRange(3, 6);
//}
//Sample output
//3
//6


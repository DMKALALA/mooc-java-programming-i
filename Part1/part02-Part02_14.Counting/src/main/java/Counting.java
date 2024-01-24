
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rangeOfNumbers = Integer.valueOf(scanner.nextLine());
        
//        for(int i=0; i<= rangeOfNumbers; i++){
//            System.out.println(i);
//        }
        int i = 0;
        while( i <= rangeOfNumbers){
            System.out.println(i);
            i++;
        }
    }
}

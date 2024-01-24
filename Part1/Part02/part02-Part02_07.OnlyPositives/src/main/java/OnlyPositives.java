
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Give a number: ");
            int givenNumber = Integer.valueOf(scanner.nextLine());
            double result = Math.pow(givenNumber, 2);
            if(givenNumber<0){
                System.out.println("Unsuitable number");
                continue;
            }else if(givenNumber==0){
                break;
            }
            System.out.println((int)result);
            //System.out.println(givenNumber *= givenNumber);
        }

    }
}

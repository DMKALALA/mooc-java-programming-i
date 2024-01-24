
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        int firstIndex = 0;
        int lastIndex = list.size()-1;
        if(firstIndex >=0 && lastIndex>=0){
            System.out.printf("%s %n",list.get(firstIndex));
            System.out.printf("%s",list.get(lastIndex));
        }else{
            System.out.println("Error 404");
        }
    }
}

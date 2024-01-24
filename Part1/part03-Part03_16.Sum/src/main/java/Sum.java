
import java.util.ArrayList;
import java.util.*;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Add items then press -1 to stop");
        
        
        while(true){
            int num = in.nextInt();
            if(num == -1  ){
               break;
            }
            list.add(num);
            
        }
        list.set(0,4);
        System.out.println(sum(list));
        System.out.println(list);
    }
    public static int sum(ArrayList<Integer> numbers){
       if (numbers.size() == 0){
           return -1;
       }
       int sum =0;
       for(int num:numbers){
          sum+=num;
       }
       return sum;
    }
}


public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        
        for(int numbers:array){
            
//            if(array.length == 0 ){
//                System.out.println(" ");
//            }
            
            if(numbers == array[array.length -1]){
                System.out.print(numbers);
            }else{
                System.out.printf("%d , ",numbers);
            }
        }
    }
}


public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
    for (int i = 0; i < array.length; i++) {
        // Print stars based on the value of the array element
        for (int j = 0; j < array[i]; j++) {
            System.out.print("*");
        }
        // Move to the next line after printing stars for the current element
        System.out.println();
    }
}


}

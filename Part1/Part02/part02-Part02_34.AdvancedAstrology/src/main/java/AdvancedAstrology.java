
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        int val = 0;
        while(val < number){
            System.out.print("*");
            val++;
        }
        System.out.println(""); 
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int val = 0;
        while(val < number){
            System.out.print(" ");
            val++;
        }
         
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i); 
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);  // Print leading spaces
            printStars(2 * i - 1);    // Print stars for the current row
        }

        // Print the tree trunk (centered)
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);  // Adjust the trunk width as needed
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

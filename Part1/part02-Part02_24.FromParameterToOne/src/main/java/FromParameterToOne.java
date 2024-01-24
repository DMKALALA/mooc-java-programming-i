public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int number) {

        while (number >= 1) { // Change the loop condition to print from 'number' down to 1
            System.out.println(number);
            number--;
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner =  new Scanner(System.in);
        
        while(true){
            System.out.println("Title:");
            String name = scanner.nextLine();
            
            if(name.isEmpty()){
                break;
            }
            
            System.out.println("Pages:");
            int title = Integer.valueOf(scanner.nextInt());
            scanner.nextLine(); // Consume the newline character
            
            System.out.println("Publication year:");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
             
            books.add(new Book(name, title, year));
        }
        
        System.out.println("What information will be printed?");
        String option = scanner.nextLine();
        
        for(Book book: books){
            if(option.equalsIgnoreCase("name")){
                System.out.println(book.getTitle());
            }
            else if(option.equalsIgnoreCase("everything")){
                System.out.println(book.toString());
            
            }
        }
    }
}

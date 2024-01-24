

import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longestName = 0;
        String name = " ";
        int count =0;
        int sumYears =0;
        
        
        while(true){
            String word = scanner.nextLine();
            
            String [] pieces = word.split(",");
            if(word.equals("")){
                break ;
            }
            
            
            int longest = pieces[0].length();
            String currentName = pieces[0];
            
            if(longest > longestName){
                longestName = longest;
                name = currentName;
            }
            
            int year = Integer.valueOf(pieces[1]);
            sumYears+=year;
            count++;
            
        }
        double average = (double) sumYears/count;
        System.out.printf("Longest name: %s%n", name);
        System.out.printf("Average of the birth years: %f",average);

    }
}

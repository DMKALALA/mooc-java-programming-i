
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        ArrayList <Teams> teams = readRecordsFromFile(file);
        int count = 0; 
        int wins = 0;
        
        for(Teams games :teams){
            
            if(games.getAwayTeam().contains(team) || games.getHomeTeam().contains(team)  ){
                count++;
                if (games.getHomeTeam().equals(team) && games.getHomePoints() > games.getAwayPoints()) {
                    wins++;
                } else if (games.getAwayTeam().equals(team) && games.getAwayPoints() > games.getHomePoints()) {
                    wins++;
                } 
            }
            
            
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (count-wins));
        
            
    }
public static ArrayList<Teams> readRecordsFromFile(String file) {
        ArrayList<Teams> games = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        try(Scanner reader = new Scanner(Paths.get(file))) {
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String [] parts = line.split(",");
                
                String team1 = parts[0];
                int homePoints = Integer.valueOf(parts[2]);
                String team2 = parts[1];
                int awayPoints = Integer.valueOf(parts[3]);
                games.add(new Teams(team1,team2,homePoints,awayPoints));
            }
        } catch (Exception e) {
            System.out.println(" ");
        }
        return games;

    }
}

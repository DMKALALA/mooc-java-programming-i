/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DENIS
 */
public class Teams {
    private String homeTeam;
    private int homePoints;
    private String awayTeam;
    private int awayPoints;
    
    public Teams(String homeTeam, String awayTeam,int homePoints,int awayPoints){
        this.homeTeam = homeTeam;
        this.homePoints = homePoints;
        this.awayTeam = awayTeam;
        this.awayPoints = awayPoints;
        
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    

    public int getHomePoints() {
        return homePoints;
    }

   

    public String getAwayTeam() {
        return awayTeam;
    }

   

    public int getAwayPoints() {
        return awayPoints;
    }

    @Override
    public String toString() {
        return "Teams{" + "homeTeam=" + homeTeam + ", homePoints=" + homePoints + ", awayTeam=" + awayTeam + ", awayPoints=" + awayPoints + '}';
    }

   
    
    
}

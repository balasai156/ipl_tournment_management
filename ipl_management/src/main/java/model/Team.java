package model;

public class Team {
    int teamId;
    String teamName;
    String shortName;
    
    public Team(int teamId, String teamName, String shortName) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.shortName = shortName;
    }
    
    public int getTeamId() {
        return teamId;
    }
    
    public String getTeamName() {
        return teamName;
    }
    
    public String getShortName() {
        return shortName;
    }
}
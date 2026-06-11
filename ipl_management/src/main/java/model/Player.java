package model;

public class Player {
    int playerId;
    String playerName;
    int teamId;
    String role;
    
    public Player(int playerId, String playerName, int teamId, String role) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.teamId = teamId;
        this.role = role;
    }
    
    public int getPlayerId() {
        return playerId;
    }
    
    public String getPlayerName() {
        return playerName;
    }
    
    public int getTeamId() {
        return teamId;
    }
    
    public String getRole() {
        return role;
    }
}

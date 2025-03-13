

public class Team {
    private String teamName;
    private String teamColor;
    private int teamClassification;

    public Team(String teamName, String teamColor, int teamClassification) {
        this.teamName = "Realeza";
        this.teamColor = "Black";
        this.teamClassification = 99;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamColor() {
        return teamColor;
    }

    public void setTeamColor(String teamColor) {
        this.teamColor = teamColor;
    }

    public int getTeamClassification() {
        return teamClassification;
    }
}

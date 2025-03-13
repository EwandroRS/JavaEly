

public class TeamObjects{
    public static void main(String[] args) {
        Team team = new Team("Realeza", "Black", 99);
        System.out.println("Team name: " + team.getTeamName());
        System.out.println("Team color: " + team.getTeamColor());
        System.out.println("Team classification: " + team.getTeamClassification());
    }
}
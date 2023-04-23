import java.util.ArrayList;
import java.util.List;

public class CricketTeams {
    private String teamName;
    private List<cricketPlayer> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public CricketTeams(String teamName) {
        this.teamName = teamName;
    }
    public void addTeamPlayer(cricketPlayer player) {
        if(!teamMembers.contains(player)) {
            teamMembers.add(player);
        }
    }
    public void listTeamMembers() {
        System.out.println(teamName+" Players:");
        System.out.println(teamMembers);
    }
    public int ranking() {
        return (totalLosses*2)+totalTies+1;
    }

    public String setScore(int ourScore, int theirScore) {
        String message = "lost";
        if(ourScore > theirScore) {
            totalWins++;
            message="beat";
        } else if (ourScore == theirScore) {
            totalTies++;
            message = "tied";
        }else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return teamName+"(Ranking:"+ranking()+")";
    }
}

import java.util.ArrayList;
import java.util.List;

record Affiliation(String name,String type,String countryCode){
    @Override
    public String toString() {
        return name+"("+type+" in "+countryCode+")";
    }
}
public class Team<T extends Player, S> {
    private String teamName;
    private S affiliation;
    private List<T> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalTies = 0;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, S affiliation) {
        this.teamName = teamName;
        this.affiliation = affiliation;
    }

    public void addTeamPlayer(T t) {
        if(!teamMembers.contains(t)) {
            teamMembers.add(t);
        }
    }
    public void listTeamMembers() {
        System.out.print(teamName);
        System.out.println(affiliation == null ? " ":" - AFFILIATION -> "+affiliation);
        System.out.println(" Players:");
        for(T t : teamMembers) {
            System.out.print(t.name() +" - ");
            System.out.println(t.position());
        }
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

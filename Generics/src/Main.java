record cricketPlayer(String name, String position){}
public class Main {
    public static void main(String[] args) {
        CricketTeams rcb = new CricketTeams("Royal Challengers Bangalore");
        CricketTeams lsg = new CricketTeams("Lucknow Super Gaints");
        scoreResult(rcb,189,lsg,150);
        var virat = new cricketPlayer("Virat Kholi","Batsman");
        var siraj = new cricketPlayer("Mohammad Siraj","Bowler");
        var rahul = new cricketPlayer("K L Rahul","Batsman");
        var gowtham = new cricketPlayer("K Gowtham","AllRounder");
        rcb.addTeamPlayer(virat);
        rcb.addTeamPlayer(siraj);
        rcb.listTeamMembers();
        lsg.addTeamPlayer(rahul);
        lsg.addTeamPlayer(gowtham);
        lsg.listTeamMembers();
    }
    public static void scoreResult(CricketTeams team1, int t1_Score,
                                   CricketTeams team2, int t2_Score){
        String message = team1.setScore(t1_Score,t2_Score);
        team2.setScore(t2_Score,t1_Score);
        System.out.printf("%s %s %s %n",team1,message,team2);
    }
}

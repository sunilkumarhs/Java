interface Player{}
record cricketPlayer(String name, String position) implements Player{}
record footBallPlayer(String name, String position) implements Player{}
public class Main {
    public static void main(String[] args) {
//        CricketTeams rcb = new CricketTeams("Royal Challengers Bangalore");
//        CricketTeams lsg = new CricketTeams("Lucknow Super Gaints");
//        scoreResult(rcb,189,lsg,150);
        var virat = new cricketPlayer("Virat Kholi","Batsman");
        var siraj = new cricketPlayer("Mohammad Siraj","Bowler");
        var rahul = new cricketPlayer("K L Rahul","Batsman");
        var gowtham = new cricketPlayer("K Gowtham","AllRounder");
//        rcb.addTeamPlayer(virat);
//        rcb.addTeamPlayer(siraj);
//        rcb.listTeamMembers();
//        lsg.addTeamPlayer(rahul);
//        lsg.addTeamPlayer(gowtham);
//        lsg.listTeamMembers();
//        SportsTeam bfc = new SportsTeam("Bangalore FootBall Club");
//        SportsTeam gfc = new SportsTeam("Goa FootBall Club");
//        scoreResult(bfc,2,gfc,1);
        var chetri = new footBallPlayer("Sunil Chetri","Striker");
        var gurkrith = new footBallPlayer("Gurkrith Singh","Goal Keeper");
//        bfc.addTeamPlayer(chetri);
//        gfc.addTeamPlayer(gurkrith);
//        bfc.listTeamMembers();
//        gfc.listTeamMembers();
        Team<footBallPlayer> bfc1 = new Team<>("Bangalore FootBall Club");
        Team<footBallPlayer> gfc1 = new Team<>("Goa FootBall Club");
        scoreResult(bfc1,2,gfc1,1);
        bfc1.addTeamPlayer(chetri);
        gfc1.addTeamPlayer(gurkrith);
        bfc1.listTeamMembers();
        gfc1.listTeamMembers();
        Team<cricketPlayer> rcb1 = new Team<>("Royal Challengers Bangalore");
        Team<cricketPlayer> lsg1 = new Team<>("Lucknow Super Gaints");
        scoreResult(rcb1,189,lsg1,150);
        rcb1.addTeamPlayer(virat);
        rcb1.addTeamPlayer(siraj);
        rcb1.listTeamMembers();
        lsg1.addTeamPlayer(rahul);
        lsg1.addTeamPlayer(gowtham);
        lsg1.listTeamMembers();
    }
    public static void scoreResult(CricketTeams team1, int t1_Score,
                                   CricketTeams team2, int t2_Score){
        String message = team1.setScore(t1_Score,t2_Score);
        team2.setScore(t2_Score,t1_Score);
        System.out.printf("%s %s %s %n",team1,message,team2);
    }
    public static void scoreResult(SportsTeam team1, int t1_Score,
                                   SportsTeam team2, int t2_Score){
        String message = team1.setScore(t1_Score,t2_Score);
        team2.setScore(t2_Score,t1_Score);
        System.out.printf("%s %s %s %n",team1,message,team2);
    }
    public static void scoreResult(Team team1, int t1_Score,
                                   Team team2, int t2_Score){
        String message = team1.setScore(t1_Score,t2_Score);
        team2.setScore(t2_Score,t1_Score);
        System.out.printf("%s %s %s %n",team1,message,team2);
    }
}

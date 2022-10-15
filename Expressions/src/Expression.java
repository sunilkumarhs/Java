public class Expression {
    public static void main(String[] args) {
        double score1=1718;
        double score2=17180107d;
        double score3=17.18;
        double highScore;
        if((score1>score2)&&(score1>score3)){
            highScore=score1;
        }
        else highScore = Math.max(score2, score3);
        /*alternate meaning full statement
        if(score2>score3){
                  highScore=score2;
                }
                else {
                    highScore=score3;
                }*/
        System.out.println("The high score is :"+highScore);
        double lowScore;
        lowScore= Math.min(score1,score3);
        System.out.println("The Low"+
                "score is :"+
                lowScore);
        System.out.println(" ");
        //statements
        int score=0;
        int bonus=200;
        int level=0;
        boolean gameOver=true;
        String str="startGame";
        System.out.println("Starting the Game");
        if(str.equals("startGame")){
            for(int i=1;i<10;i++){
                level++;
                score+=100;
            }
        }
        System.out.println("Game is running");
        System.out.println("!!!Game Over!!!");
        if(gameOver){
            int finalScore=score+(level*bonus);
            System.out.println("Your score is :"+score);
            System.out.println("Your final score is :"+finalScore);
        }
        System.out.println(" ");
        System.out.println("Second Game is Started");
        int secondScore=0;
        gameOver=false;
        if(!gameOver){
            for(int i=0;i<8;i++){
                level++;
                secondScore+=100;
            }
        }
        System.out.println("Game is running");
        System.out.println("!!!Game Over!!!");
        gameOver=true;
        if(gameOver){
            int finalScore=secondScore+score+(level*bonus);
            System.out.println("Your second score is :"+secondScore);
            System.out.println("Your final score is :"+finalScore);
        }
    }
}

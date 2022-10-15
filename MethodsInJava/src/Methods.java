public class Methods {
    public static void main(String[] args) {
        int pos=0;
        displayHighScorePosition("Sunil",pos);
        pos=calculateHighScore(1500);
        displayHighScorePosition("Charan",pos);
        pos=calculateHighScore(900);
        displayHighScorePosition("Srinivas",pos);
        pos=calculateHighScore(400);
        displayHighScorePosition("SunilKV",pos);
        pos=calculateHighScore(50);
        displayHighScorePosition("Madhu",pos);
        long speed=speedConverter(105);
        System.out.println("The speed of the vehicle is :"+speed+"mi/h");

    }
    public static void displayHighScorePosition(String name,int pos){
        if(pos==0){
            System.out.println("The player "+name+"is leader of the high score table");
        }else
        System.out.println("The player "+name+" managed to get position "+pos+" on the high score table");
    }
    public static int calculateHighScore(int score){
        if(score>=1000){
            return 1;
        } else if (score>=500) {
            return 2;
        } else if (score>=100) {
            return 3;
        }else return 4;
    }
    public static long speedConverter(long kmh){
        if(kmh<0){
            return -1;
        }
        return Math.round(kmh/1.609);
    }
}

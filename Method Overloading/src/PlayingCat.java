public class PlayingCat {
    public static void main(String[] args) {
        PlayingCat.isCatPlaying(true,25);
        PlayingCat.isCatPlaying(false,25);
        PlayingCat.isCatPlaying(false,45);
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(summer && temperature>=25&&temperature<=45) {
            System.out.println("The cat is playing in summer in good temperature");
            return true;
        }else if(!summer && temperature>=25&&temperature<=35) {
            System.out.println("The cat is playing in good temperature but not in summer");
            return true;
        }
        System.out.println("The cat is playing in bad temperature and not in summer");
        return false;
    }
}

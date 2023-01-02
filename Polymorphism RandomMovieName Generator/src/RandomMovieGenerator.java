public class RandomMovieGenerator {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++) {
            Movie movie = randomMovie();
            System.out.println("The Movie #"+i+" name is :- "+movie.getClass().getSimpleName()+"\n"
                               +"The Plot of the Movie is :- "+movie.plot());
            movie.watchMovie();
            System.out.println("*".repeat(50));
        }
    }
    public static  Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("The random number generated was : "+randomNumber);
        switch(randomNumber) {
            case 1:
                return new Kranthi();
            case 2:
                return new Kanthara();
            case 3:
                return new KGF();
            case 4:
                return new James();
            case 5:
                return new Bajarangi();
            default:
                return null;
        }
    }
}

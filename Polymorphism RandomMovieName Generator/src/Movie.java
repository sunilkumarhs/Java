public class Movie {
    private String generes;
    public Movie() {
    }
    public void watchMovie() {
        generes=this.getClass().getSimpleName();
        System.out.println("This Movie is "+generes+" movie");
    }
    public String plot() {
        return "No Plot in this Movie";
    }
}
class Kanthara extends Movie implements Generes {
    @Override
    public void watchMovie() {
        ScienceFriction sf = new ScienceFriction();
        sf.watchMovie();

    }

    public String plot() {
        return "The Mysterious Forest";
    }
}

class Kranthi extends Movie implements Generes {
    @Override
    public void watchMovie() {
        Adventure ad = new Adventure();
        ad.watchMovie();
    }
    @Override
    public String plot() {
        return "Education System";
    }
}

class KGF extends  Movie implements Generes {
    @Override
    public void watchMovie() {
        Adventure ad = new Adventure();
        ad.watchMovie();
    }
    @Override
    public String plot() {
        return "The World of Gold Mine";
    }
}

class James extends Movie implements Generes{
    @Override
    public void watchMovie() {
        Comedy cd = new Comedy();
        cd.watchMovie();
    }
    //No Plot
}

class Bajarangi extends  Movie implements Generes{
    @Override
    public void watchMovie() {
        ScienceFriction sf = new ScienceFriction();
        sf.watchMovie();
    }
    @Override
    public String plot() {
        return "The Story of Dhanvantri Roopa";
    }
}
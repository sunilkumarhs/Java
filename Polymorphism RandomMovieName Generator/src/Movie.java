public class Movie {
    private String name;
    public Movie(String name) {
        this.name=name;
    }
    public String plot() {
        return "No Plot in this Movie";
    }

    public String getName() {
        return name;
    }
}
class Kanthara extends Movie {
    public Kanthara() {
        super("Kanthara");
    }
    public String plot() {
        return "The Mysterious Forest";
    }
}

class Kranthi extends Movie {
    public Kranthi() {
        super("Kranthi");
    }
    @Override
    public String plot() {
        return "Education System";
    }
}

class KGF extends  Movie {
    public KGF() {
        super("KGF-2");
    }
    @Override
    public String plot() {
        return "The World of Gold Mine";
    }
}

class James extends Movie {
    public James() {
        super("James");
    }
    //No Plot
}

class Bajarangi extends  Movie {
    public Bajarangi() {
        super("Bajarangi-2");
    }

    @Override
    public String plot() {
        return "The Story of Dhanvantri Roopa";
    }
}
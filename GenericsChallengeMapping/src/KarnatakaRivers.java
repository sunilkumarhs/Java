public class KarnatakaRivers extends Line{
    private String name;

    public KarnatakaRivers(String name,String... location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name+" River ";
    }
}

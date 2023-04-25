public class KarnatakaParks extends Point{
    private String name;

    public KarnatakaParks(String name,String location) {
        super(location);
        this.name = name;
    }

    @Override
    public String toString() {
        return name+" National Park";
    }
}

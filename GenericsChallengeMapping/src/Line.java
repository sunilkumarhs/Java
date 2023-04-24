import java.util.Arrays;

public abstract class Line implements Mappable{
    private double[][] location;

    public Line(String... location) {
        this.location = new double[location.length][];
        int index = 0;
        for(var l : location) {
            this.location[index++] = Mappable.stringToLocation(l);
        }

    }

    @Override
    public void render() {
        System.out.println("Render "+this+" as LINE ( "+location()+" )");
    }
    private String location() {
        return Arrays.deepToString(location);
    }
}

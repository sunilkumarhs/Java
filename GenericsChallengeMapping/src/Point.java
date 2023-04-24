import java.util.Arrays;

public abstract class Point implements Mappable {

    private double[] location = new double[2];

    public Point(String location) {
        this.location = Mappable.stringToLocation(location);
    }

    @Override
    public void render() {
        System.out.println("Render "+this+" as POINT ( "+location()+" )");
    }
    private String location() {
        return Arrays.toString(location);
    }
}


public interface Mappable {
    public abstract void render();
    static double[] stringToLocation(String location) {
        var splits = location.split(",");
        double lat = Double.valueOf(splits[0]);
        double lng = Double.valueOf(splits[1]);
        return new double[]{lat,lng};
    }
}

public class Main {
    public static void main(String[] args) {

        var nationalKarnatakaParks = new KarnatakaParks[] {
                new KarnatakaParks("Bannerghatta","12.79895573752652, 77.56791858947713"),
                new KarnatakaParks("Bandipur","11.779013158415983, 76.46465913670413")
        };

        Layer<KarnatakaParks> parksLayer = new Layer<>(nationalKarnatakaParks);
        parksLayer.renderLayer();

        var nationalKarnatakaRivers = new KarnatakaRivers[] {
                new KarnatakaRivers("Kaveri","12.427657924063828, 76.68299009438697","12.412454252331354, 76.68323018273816","12.423403710774151, 76.5877280716826"),
                new KarnatakaRivers("Krishna","16.43089439447072, 75.65593779318009","16.302972782915315, 75.75313058819629","16.178649516190642, 76.19034342020774")
        };
        Layer<KarnatakaRivers> riversLayer = new Layer<>();
        riversLayer.addLayeredElements(nationalKarnatakaRivers);
        riversLayer.renderLayer();
    }
}

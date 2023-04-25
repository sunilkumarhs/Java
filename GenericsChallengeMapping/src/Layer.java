import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {

    private List<T> layeredElements;

    public Layer() {
        this.layeredElements = new ArrayList<T>();
    }

    public Layer(T[] layeredElements) {
        this.layeredElements = new ArrayList<T>(List.of(layeredElements));
    }

    public void addLayeredElements(T... elements) {
        layeredElements.addAll(List.of(elements));
    }

    public void renderLayer() {
        for(T element : layeredElements) {
            element.render();
        }
    }
}

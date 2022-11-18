public class MotherBoard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int graphicCardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer, int ramSlots, int graphicCardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.graphicCardSlots = graphicCardSlots;
        this.bios = bios;
    }

    public void loadProgram(String prgName) {
        System.out.println("Welcome to "+prgName+" world");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getGraphicCardSlots() {
        return graphicCardSlots;
    }

    public String getBios() {
        return bios;
    }
}

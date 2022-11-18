public class Lamp {
    private String company;
    private boolean battery;
    private String style;

    public Lamp(String company, boolean battery, String style) {
        this.company = company;
        this.battery = battery;
        this.style = style;
    }

    public void turnOn(boolean button) {
        if(button) {
            System.out.println("Lamp is on");
        }else {
            System.out.println("Lamp is off");
        }
    }

    public String getCompany() {
        return company;
    }

    public boolean isBattery() {
        return battery;
    }

    public String getStyle() {
        return style;
    }
}

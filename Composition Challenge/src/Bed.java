public class Bed {
    private float length;
    private float width;
    private int pillows;
    private int sheets;
    private String company;

    public Bed(float length, float width, int pillows, int sheets, String company) {
        this.length = length;
        this.width = width;
        this.pillows = pillows;
        this.sheets = sheets;
        this.company = company;
    }

    public void ready( boolean get) {
        if(get) {
            System.out.println("Bed is ready to sleep");
        }else {
            System.out.println("Bed is not ready to sleep");
        }
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }

    public String getCompany() {
        return company;
    }
}

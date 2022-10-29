public class Car {
    private int doors;
    private int seats;
    private String model;
    private String engine;
    private String colour;
    public void setDoors(int doors) {
        if(doors<2||doors>5) {
            this.doors=-1;
        }else {
            this.doors=doors;
        }
    }
    public void setModel(String model) {
        String validModel=model.toLowerCase();
        if(validModel.equals("xuv700")||validModel.equals("Safari")) {
            this.model=model;
        }else {
            this.model="Unknown";
        }
    }
    public void setColour(String colour) {
        String validColour=colour.toLowerCase();
        if(validColour.equals("red")||validColour.equals("blue")||validColour.equals("black")||validColour.equals("white")) {
            this.colour=colour;
        }else {
            this.colour="Unknown";
        }
    }
    public void setEngine(String engine) {
        this.engine=engine;
    }
    public void setSeats(int seats) {
        if(seats<4||seats>7) {
            this.seats=-1;
        }else {
            this.seats=seats;
        }
    }

    public int getDoors() {
        return this.doors;
    }

    public int getSeats() {
        return this.seats;
    }

    public String getModel() {
        return this.model;
    }

    public String getEngine() {
        return this.engine;
    }

    public String getColour() {
        return this.colour;
    }
}

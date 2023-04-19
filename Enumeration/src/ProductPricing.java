public enum ProductPricing {
    Tomato,
    Potato,
    Onion,
    Mango,
    MadAngles,
    Gee,
    Curd;
    public double getPrice() {
        return switch(this) {
            case Tomato -> 120;
            case Potato -> 200;
            case Onion -> 300;
            case Mango -> 250;
            case MadAngles -> 50;
            case Gee -> 240;
            case Curd -> 10;
            default -> 0.0;
        };
    }
}

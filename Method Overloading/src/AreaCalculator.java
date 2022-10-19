public class AreaCalculator {
    public static void main(String[] args) {
        AreaCalculator.area(250);
        AreaCalculator.area(23,45);
    }
    public static double area(double radius) {
        if (radius<0) {
            return -1.0;
        }
        double areas=radius*radius*Math.PI;
        System.out.println("The Area of the Circle is :"+areas);
        return areas;
    }
    public static double area(double x, double y) {
        if(x<0 || y<0) {
            return -1.0;
        }
        double areas=x*y;
        System.out.println("The Area of the Rectangle is :"+areas);
        return areas;
    }
}

/*The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters x and y of type int and it needs to initialize the fields.

Write the following methods (instance methods):
* Method named getX without any parameters, it needs to return the value of x field.
* Method named getY without any parameters, it needs to return the value of y field.
* Method named setX with one parameter of type int, it needs to set the value of the x field.
* Method named setY with one parameter of type int, it needs to set the value of the y field.
* Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
* Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.
TEST EXAMPLE
→ TEST CODE:
Point first = new Point(6, 5);
Point second = new Point(3, 1);
System.out.println("distance(0,0)= " + first.distance());
System.out.println("distance(second)= " + first.distance(second));
System.out.println("distance(2,2)= " + first.distance(2, 2));
Point point = new Point();
System.out.println("distance()= " + point.distance());
OUTPUT
distance(0,0)= 7.810249675906654
distance(second)= 5.0
distance(2,2)= 5.0
distance()= 0.0*/
public class Point {
    private int x;
    private int y;
    public Point() {

    }
    public Point(int x,int y) {
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void setX(int x) {
        this.x=x;
    }
    public void setY(int y) {
        this.y=y;
    }
    public double distance() {
        double dist=((0-this.x)*(0-this.x)+(0-this.y)*(0-this.y));
        return Math.sqrt(dist);
    }
    public double distance(int x,int y) {
        double dist=((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
        return Math.sqrt(dist);
    }
    public double distance(Point p) {
        double dist=((p.x-this.x)*(p.x-this.x)+(p.y-this.y)*(p.y-this.y));
        return Math.sqrt(dist);
    }
}

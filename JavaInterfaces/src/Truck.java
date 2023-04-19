public class Truck implements Tracking{
    @Override
    public void track() {
        System.out.println(getClass().getName()+"'s co-ordinates are recorded");
    }
}

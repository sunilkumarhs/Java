public class Mian {
    public static void main(String[] args) {
        boolean wakeUp = BarkingDog.shouldWakeUp(true,2);
        if(wakeUp) {
            System.out.println("You should wakeup");
        }
        else {
            System.out.println("Don't wakeup");
        }
    }
}

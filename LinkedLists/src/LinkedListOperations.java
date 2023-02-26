import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
//        LinkedList<String> listOper = new LinkedList<>();
        var listOper = new LinkedList<String>();

        listOper.add("Bangalore");
        listOper.add(0, "Mysore");
        System.out.println(listOper);

        addElements(listOper);
        System.out.println(listOper);

        removeElements(listOper);
        System.out.println(listOper);
    }
    private static void addElements(LinkedList<String> list) {
        list.add("Mumbai");
        list.addFirst("Delhi");
        list.addLast("Kolkata");
        //Queue Operations
        list.offer("Ahmadabad");
        list.offerFirst("Kashmir");
        list.offerLast("Chennai");
        //Stack Operations
        list.push("Hyderabad");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove();
        list.remove(4);
        list.remove("Ahmadabad");
        String r0 = list.removeLast();
        System.out.println("The element removed is: "+r0);
        //Queue Operations
        String r1 = list.poll();
        System.out.println("The element removed is: "+r1);
        String r2 = list.pollFirst();
        System.out.println("The element removed is: "+r2);
        String r3 = list.pollLast();
        System.out.println("The element removed is: "+r3);
        //Stack Operations
        list.push("Delhi");
        list.push("Kolkata");
        System.out.println(list);
        String r4 = list.pop();
        System.out.println("The element removed is: "+r4);
        String r5 = list.pop();
        System.out.println("The element removed is: "+r5);
    }
}

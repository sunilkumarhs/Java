import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOperations {
    public static void main(String[] args) {
//        LinkedList<String> listOper = new LinkedList<>();
        var listOper = new LinkedList<String>();

        listOper.add("Bangalore");
        listOper.add(0, "Mysore");
        System.out.println(listOper);

        addElements(listOper);
        System.out.println(listOper);
        System.out.println();
        System.out.println("List Retrieval");
        listRetreval(listOper);
        System.out.println();
        System.out.println("List Printing");
        printList(listOper);
        System.out.println();
        System.out.println("List Removal");
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
    private static void listRetreval(LinkedList<String> list) {
        System.out.println("The Retrieved element is: "+list.get(4));
        System.out.println("The Retrieved element index is: "+list.indexOf("Mysore"));
        System.out.println("The Retrieved element is: "+list.getFirst());
        System.out.println("The Retrieved element is: "+list.getLast());
        //Queue Retrieval
        System.out.println("The Retrieved element is: "+list.element());
        //Stack Retrieval
        System.out.println("The Retrieved element is: "+list.peek());
        System.out.println("The Retrieved element is: "+list.peekFirst());
        System.out.println("The Retrieved element is: "+list.peekLast());
    }

    private static void printList(LinkedList<String> list) {
        System.out.println("The Starting Element is: "+list.getFirst());
        for(int i=1;i<list.size();i++) {
            System.out.println("---->From "+list.get(i-1)+" to "+list.get(i));
        }
        System.out.println("The Ending Element is: "+list.getLast());
    }

    private static void printList1(LinkedList<String> list) {
        System.out.println("The Starting Element is: "+list.getFirst());
        String start = list.getFirst();
        for(String element : list) {
            System.out.println("---->From "+start+" to "+element);
            start = element;
        }
        System.out.println("The Ending Element is: "+list.getLast());
    }

    private static void printList2(LinkedList<String> list) {
        System.out.println("The Starting Element is: "+list.getFirst());
        String preElement = list.getFirst();
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()) {
            var element = iterator.next();
            System.out.println("---->From "+preElement+" to "+element);
            preElement = element;
        }
        System.out.println("The Ending Element is: "+list.getLast());
    }
}

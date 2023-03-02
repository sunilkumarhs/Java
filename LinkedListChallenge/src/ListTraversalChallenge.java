import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Scanner;
record places(String name, float dist){
    @Override
    public String toString() {
        return String.format("%s (%f)",name, dist);
    }
}
public class ListTraversalChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<places> visitPlace = new LinkedList<>();
        places bangalore = new places("Bangalore", 0);
        addPlace(visitPlace, bangalore);
        while(true) {
            System.out.println("1: AddCities \n 2: View the Cities \n 3: Travel \n 4: Exit");
            int ch = scan.nextInt();
            switch(ch) {
                case 1 -> {
                    System.out.println("Enter City name : ");
                    String city = scan.next();
                    System.out.println("Enter its distance from Bangalore : ");
                    float dist = scan.nextFloat();
                    places place = new places(city, dist);
                    addPlace(visitPlace, place);
                }
                case 2 -> System.out.println(visitPlace);
                case 3 -> tourPlaces(visitPlace);
                case 4 -> System.exit(0);
            }
        }
    }
    private static void addPlace(LinkedList<places> list, places place) {
        if(list.contains(place)) {
            System.out.println("This Place is already present!!");
            return;
        }
        for(places p : list) {
            if(p.name().equalsIgnoreCase(place.name())) {
                System.out.println("This Place is already present!!");
                return;
            }
        }
        int matchedIndex =0;
        for(var listPlace : list) {
            if(place.dist() < listPlace.dist()) {
                list.add(matchedIndex, place);
                System.out.println("City added to list at "+matchedIndex+" position");
                return;
            }
            matchedIndex++;
        }
        list.add(place);
        System.out.println("City added to list");
    }

    private static void tourPlaces(LinkedList<places> cities) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("The options for travelling:");
            System.out.println("F : Forward \n B : Backward \n L : List Places \n M : Menu \n Q : Quit");
            System.out.println("Please select your choice :");
            ListIterator<places> listIterator = cities.listIterator();
            String tour = scan.nextLine();
            if(Objects.equals(tour, "F") || Objects.equals(tour, "Forward")) {

            }
        }

    }
}

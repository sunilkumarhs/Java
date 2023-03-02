import java.util.LinkedList;
import java.util.ListIterator;
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
                    while(true) {
                        System.out.println("Enter exit or end or e to come out of the AddCities");
                        System.out.println("Enter City name : ");
                        String city = scan.next();
                        if(city.equalsIgnoreCase("exit")||city.equalsIgnoreCase("end")||city.substring(0,1).equalsIgnoreCase("e")) {
//                            addcity = false;
                            break;
                        }
                        System.out.println("Enter its distance from Bangalore : ");
                        float dist = scan.nextFloat();
                        places place = new places(city, dist);
                        addPlace(visitPlace, place);
                    }
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
        ListIterator<places> listIterator = cities.listIterator();
        boolean forward = true;
        boolean backward = false;
        boolean quit = false;
        printMenu();
        while(!quit) {
            if(!listIterator.hasPrevious()) {
                System.out.println("Originating : "+listIterator.next());
                forward = true;
            }
            if(!listIterator.hasNext()) {
                System.out.println("End of the List");
                forward = false;
            }
            System.out.println("Please select your action :");
            String tour = scan.nextLine().toUpperCase().substring(0,1);
            switch (tour) {
                case "F" -> {
                    System.out.println("user chose forward!!");
                    if(!forward) {
                        forward=true;
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                    }
                    if(listIterator.hasNext()) {
                        System.out.println(listIterator.next());
                    }
                }
                case "B" -> {
                    System.out.println("User chose backward!!");
                    if(forward) {
                        forward=false;
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println(listIterator.previous());
                    }
                }
                case "L" -> {
                    System.out.println("The Places to visit are :");
                    for(var place : cities) {
                        System.out.println(place.name());
                    }
                }
                case "M" -> printMenu();
                default -> quit=true;
            }
        }

    }

    private static void printMenu() {
        System.out.println(""" 
                The select the word or letter for particular action :
                 (F)orward
                 (B)ackward
                 (L)isting
                 (M)enu
                """);
    }
}

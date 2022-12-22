import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.out.println("The Age Calculator:");
        int currentYear = 2022;
        try{
            System.out.println(getInputFromConsole(currentYear));
        }catch(NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }
    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi what's your Name?");
        System.out.println("Hi "+name+", Thanks for choosing this code");
        String dateOfBirth = System.console().readLine("What year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are "+age+" years old";
    }
    public static String getInputFromScanner(int currentYear) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi what's your Name");
        String name = scan.nextLine();
        System.out.println("Hi "+name+", Thanks for choosing this code");

        System.out.println("What year were you born?");
        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter the date of birth between "+(currentYear - 125)+" and "+(currentYear));
            try {
                age = checkDate(currentYear,scan.nextLine());
                validDOB = age < 0 ? false : true;
            }catch (NumberFormatException e) {
                System.out.println("Characters are not allowed!!");
            }
        }while(!validDOB);
        return "So you are "+age+" years old";
    }

    public static int checkDate(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if((dob < minimumYear || dob > currentYear)) {
            System.out.println("Invalid date of birth!!");
            return -1;
        }
        return currentYear-Integer.parseInt(dateOfBirth);
    }

}

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {
    public static void main(String... args) {
        int[] nuumberList = readIntegers();
        System.out.println(Arrays.toString(nuumberList));
        int min = minValue(nuumberList);
        System.out.println("The minimum value in array is: "+min);
    }
    private static int[] readIntegers(String... numbers) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the list of delimited numbers separated with ','comma :");
        String input = scan.nextLine();
        String[] splits = input.split(",");
        int[] numberList = new int[splits.length];
        for (int i=0;i< splits.length;i++) {
            numberList[i] = Integer.parseInt(splits[i].trim());
        }
        return numberList;
    }
    private static int minValue(int[] numbers) {
        int[] list = new int[numbers.length];
        list = Arrays.copyOf(numbers, numbers.length);
        int lessNum = Integer.MAX_VALUE;
        for (int i=0;i< list.length;i++) {
            if(list[i] < lessNum) {
                lessNum = list[i];
            }
        }
        return lessNum;
    }
}

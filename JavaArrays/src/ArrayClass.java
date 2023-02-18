import java.util.Arrays;
import java.util.Random;

public class ArrayClass {
    public static void main(String[] args) {
        int[] arrayOne = getRandomArray(17);
        System.out.println(Arrays.toString(arrayOne));

        int[] arrayTwo = getRandomArray(18);
        System.out.println(Arrays.toString(arrayTwo));

        int[] arrayThree = Arrays.copyOf(arrayTwo, arrayTwo.length);
        System.out.println(Arrays.toString(arrayThree));
        Arrays.sort(arrayTwo);
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println(Arrays.toString(arrayThree));
        int[] arrayFour = Arrays.copyOf(arrayThree, 7);
        System.out.println(Arrays.toString(arrayFour));
        int[] arrayFive = Arrays.copyOf(arrayFour, 10);
        System.out.println(Arrays.toString(arrayFive));
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] array1 = new int[len];
        for(int i=0;i<len;i++) {
            array1[i] = random.nextInt(100);
        }
        return array1;
    }
}

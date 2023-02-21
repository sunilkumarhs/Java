import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));
        int[] rarr = reverse(arr1);
        System.out.println(Arrays.toString(rarr));
    }
    public static int[] reverse(int[] arr) {
        int maxIndex = arr.length-1;
        int halfIndex = arr.length/2;
        for (int i=0;i<halfIndex;i++) {
            int temp = arr[i];
            arr[i] = arr[maxIndex-i];
            arr[maxIndex-i] = temp;
        }
        return arr;
    }
}

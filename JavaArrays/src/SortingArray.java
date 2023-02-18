import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Random;

public class SortingArray {
    public static void main(String[] args) {
        Random ranNum = new Random();
        int[] arr1 = new int[5];
        for (int i=0;i<arr1.length;i++) {
            arr1[i] = ranNum.nextInt(50);
        }
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = decSorting(arr1);
        System.out.println("The Descending Array:"+Arrays.toString(arr2));
    }

    private static int[] decSorting(int[] arr){
        int[] rarr = Arrays.copyOf(arr, arr.length);
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i=0;i<rarr.length-1;i++) {
                if(rarr[i] < rarr[i+1]) {
                    int temp = rarr[i+1];
                    rarr[i+1] = rarr[i];
                    rarr[i] = temp;
                    System.out.println("------>"+Arrays.toString(rarr));
                    flag = true;
                }
            }
            System.out.println("---->"+Arrays.toString(rarr));
        }
        return rarr;
    }
}

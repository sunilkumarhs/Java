import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[4][4];
        System.out.println(Arrays.toString(arr1));
        for (int i=0;i< arr1.length;i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }
        for (int[] outer : arr1) {
            for (var element : outer) {
                System.out.print(element+" ");
            }
            System.out.println();
        }
        for (int i=0;i< arr1.length;i++) {
            var innerArray = arr1[i];
            for (int j=0;j<innerArray.length;j++) {
//                System.out.print(arr1[i][j]+" ");
                arr1[i][j] = (i*10)+(j+1);
            }
//            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr1));

        Object[] arr = new Object[3];
        System.out.println(Arrays.deepToString(arr));

        arr[0] = new String[]{"a","b","c"};
        System.out.println(Arrays.deepToString(arr));

        arr[1] = new String[][]{
                {"1","2","3"},
                {"4","5","6","7"},
                {"8","9","10"}
        };
        System.out.println(Arrays.deepToString(arr));

        arr[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(arr));

        for (Object element : arr) {
            System.out.println("Element Type :" +element.getClass().getSimpleName());
            System.out.println("Element toString :" +element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }
}

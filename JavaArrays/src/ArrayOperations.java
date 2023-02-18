import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        for(int i=0;i<array1.length;i++) {
            array1[i]=i+1;
        }
        for(int i=0;i<array1.length;i++) {
            System.out.print(array1[i]);
        }
        System.out.println();
        int[] array2 = {5,4,3,2,1};
        for(int i=0;i<array2.length;i++) {
            System.out.print(array2[i]);
        }
        System.out.println();
        for(int element : array1) {
            System.out.print(element);
        }
        System.out.println();
        System.out.println(Arrays.toString(array2));
        Object objectVariable = array1;
        if(objectVariable instanceof int[]) {
            System.out.println("objectArray is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Sunil";
        objectArray[1] = new StringBuilder("Kumar");
        objectArray[2] = Arrays.toString(array1);

        System.out.println(Arrays.toString(objectArray));

    }
}

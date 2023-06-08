import java.util.Arrays;

public class dz12 {
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 5};
        int[] arr2 = {4, 5, 3};
        int[] result = divideArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new RuntimeException("One or both input arrays are null.");
        }
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Input arrays are not of equal length.");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Division by zero occurred.");
            }
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }
}
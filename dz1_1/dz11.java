import java.util.Arrays;

public class dz11 {
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 3};
        int[] arr2 = {4, 7, 6};
        int[] result = diffArrays(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] diffArrays(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("Один или оба входных массива пусты");
        }
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Входные массивы должны иметь одинаковую длину.");
        }
    
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}

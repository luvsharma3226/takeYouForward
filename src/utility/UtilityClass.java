package utility;

public class UtilityClass {

    public static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i]= arr[j];
        arr[j] = t;
    }
}

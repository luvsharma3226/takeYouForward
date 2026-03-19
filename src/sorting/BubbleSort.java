package sorting;

import utility.UtilityClass;

public class BubbleSort {

    static void main() {
        int []arr = new int[]{8,6,4,3,5,1};
        System.out.println(arr.length);
        bubbleSort(arr);
        UtilityClass.printArray(arr);
    }

    public static int[] bubbleSort(int[] arr){
        int n = arr.length-1;
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
               if (arr[j] > arr[j+1]){
                   int t = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = t;
                }
            }
        }
        return arr;
    }
}

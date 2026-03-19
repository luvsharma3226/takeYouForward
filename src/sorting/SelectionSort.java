package sorting;

import utility.UtilityClass;

public class SelectionSort {

    static void main() {
        int []arr = new int[]{8,6,4,3,5,1};
        System.out.println(arr.length);
        selectionSort(arr);
        UtilityClass.printArray(arr);
    }

    // Algo : Select the smallest number and bring it to fist place and increment i
    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                   min = j;
                   int t = arr[i];
                   arr[i] = arr[min];
                   arr[min] = t;
                }
            }
        }
        return arr;
    }
}

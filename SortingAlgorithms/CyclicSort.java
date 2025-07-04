package SortingAlgorithms;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
       int[] arr = {5,3,4,1,2};
       Cyclic(arr);
       System.out.println(Arrays.toString(arr));
      
    }
    public static void Cyclic(int[]arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                Swap(arr,i,correct);
            }else{
                i += 1;
            }
        }
    }

    private static void Swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

package SortingAlgorithms;

public class BubbleSort {
    public static void main(String []args){
        int []arr ={8,2,9,5,3,1,4};
        int len = arr.length;
        System.out.println("Before sorting :");
        for(int ar : arr){
            System.out.print(ar + " ");      // Time complexity : O(n^2)
        }
        System.out.println();
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        System.out.println();
        System.out.println("After sorting : ");
        for(int ar : arr){
            System.out.print(ar + " ");
        }
    }

}

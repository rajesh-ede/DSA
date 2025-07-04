package SortingAlgorithms;

public class MergeSort {
    private static void mergesort(int[] arr, int start, int end) {
        if(start < end){

       int mid = start+(end-start)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);
        merge(arr,start,mid,end);

      }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] leftArray = new int[n1] ;
        int[] rigthArray = new int[n2];

        for(int i = 0; i < n1; i++){
            leftArray[i] = arr[start + i];
        }
        for(int j = 0; j < n2; j++){
            rigthArray[j] = arr[mid+ 1 + j];
        }

        int i = 0, j = 0, k = start;
        while (i < n1 && j < n2){
            if(leftArray[i] <= rigthArray[j]){
                arr[k]= leftArray[i];
                i++;
            } else {
                arr[k] = rigthArray[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = rigthArray[j];
            j++;
            k++;
        }
    }

    public static  void main(String[] args){
        int []arr = {3,8,1,2,9,7,4};
        System.out.println("Before sorted");
        Print(arr);
        mergesort(arr,0,arr.length - 1);
        System.out.println("After sorted");
        Print(arr);
    }
    public static void Print(int[] arr){
        for(int n : arr){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

package SortingAlgorithms;
                                // Time Complexity O(n(log n))
public class QuickSort {
    static void Quick(int []arr,int low,int high) {
        if (low < high) {
            int pi = partion(arr, low, high);
            Quick(arr, low, pi - 1);
            Quick(arr, pi + 1, high);
        }
    }

    private static int partion(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j < high; j++){

            if(arr[j] <= pivot){
                i += 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return (i+1);
    }
    static void Print(int []nums){
        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String []args){
        int []arr = {4,7,8,2,1,3,6};
        System.out.println("Before Sorted");
        Print(arr);
        int size = arr.length;
        Quick(arr,0,size-1);
        System.out.println("After sorted");
        Print(arr);

    }
}

package SortingAlgorithms;

public class Insertion {
    public static void main(String [] args){
        int []arr = {2,8,9,4,16,1,3};
        System.out.println("Before sorted Array");
        for(int a : arr){
            System.out.print(a + " ");
        }
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] = key;
            System.out.println();
            for(int a : arr){
                System.out.print(a + " ");
            }
        }
        System.out.println();
        System.out.println("After sorted Array");
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}

package SortingAlgorithms;

public class LinearSearch {
    public static void main(String[] args){
        int [] arr={2,4,6,8,10};
        int target = 19;
        int ans = linear(arr,target);
        if(ans != -1){
            System.out.println("Element is found at index :" + ans);
        }else{
            System.out.println("Element is not found !");
        }

    }

    private static int linear(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
       return -1;
    }
}

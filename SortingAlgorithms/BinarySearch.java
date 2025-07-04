package SortingAlgorithms;
                                 // Time Complexity : O(log n)
public class BinarySearch
{
    public static void main(String [] args){
        int []arr = {2,3,4,5,6,7,8,9,11};
        int target = 5;
        int result = binary(arr,target);
        System.out.println("Element is present at index :" +result);

    }

    private static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}

package SortingAlgorithms;
                                   // Time Complexity O(n^2)
public class selection {
    public static void main(String[] args) {
        int[] arr = {8, 3, 9, 5, 7, 1, 2, 10};
        int len = arr.length;
        int temp = 0;
        int minIndex = 0;
        System.out.println("Array before sorted");
        for (int a : arr) {
            System.out.print(a);
        }
        System.out.println();

        for (int i = 0; i < len; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[minIndex] > arr[j]) {
                    temp = arr[minIndex];
                    arr[minIndex] = arr[j];
                    arr[j] = temp;
                }
            }

            System.out.println();
            for(int a : arr){
                System.out.print(a);
            }

        }
        System.out.println();
        System.out.println("After sorted");
        for(int a : arr){
            System.out.print(a);
        }

    }
}



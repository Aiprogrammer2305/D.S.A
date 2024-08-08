import java.util.Arrays;

public class googleq {
    public static void main(String[] args) {
        int arr[] = {3,2,4,1,7,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr) {
        int i = 0;
        while (i <arr.length) {
            int correctindex = arr[i] - 1;
            if(arr[i] != arr[correctindex]){
                swap(arr, i, correctindex);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static ans(int [] arr) {
        int i =0;
        while (i < arr.length) {
            if (arr[i] != arr[correctindex]);
            return i;
        }
    }

}
import java.util.Arrays;

 class FindMissingNumber {
    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 2, 1};
        missingnumber(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int missingnumber (int[] arr) {
        int i = 0;
        while (i <arr.length) {
            int correctindex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctindex]){
                swap(arr, i, correctindex);
            }
            else {
                i++;
            }
        }
        for (int correctindex = 0; correctindex < arr.length; correctindex++) {
            if (arr[correctindex] != correctindex) {
                return correctindex;
            }

        }

        return arr.length;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
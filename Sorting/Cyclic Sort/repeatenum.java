//import java.util.Arrays;

public class repeatenum {
    /*public static void main(String[] args) {
        int arr[] = {3, 5, 4, 2, 1};
        

    }*/

    public int sort(int[] arr) {
        int i = 0;
        while (i <arr.length) {

            if (arr[i] != i + 1) {
                   int correctindex = arr[i] -1;
                   if(arr[i] != arr[correctindex]){
                      swap(arr, i, correctindex);
                    
                    } else {
                        return arr[i];
                    }
            } else {
                i++;
            }
            
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static ans() {
        if (arr[correctindex] =! arr[i]) {
            return i;
        }
    }

}
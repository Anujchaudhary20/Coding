package Array;

import java.util.Arrays;

public class LargestElementinArray {

    public static void main(String[] args) {
        int arr [] = {2,1,7,1,3};

        Arrays.sort(arr);

        int max=arr[0];
        for (int i = 0;i< arr.length;i++){
            if(max < arr[i])
            {
                max = arr[i];
            }
        }

        System.out.println("max element is " + max + Arrays.toString(arr));
    }
}

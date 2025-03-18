package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallestElementinArray {
    public static void main(String[] args) {

        int arr[] = new int[5];
        arr[0]= 8;
        arr[1]= 5;
        arr[2]= 4;
        arr[3]= 8;
        arr[4]= 2;

        int min = arr[0];

        for (int i = 0;i<arr.length;i++){
            if (min>arr[i]){
                min= arr[i];
            }
        }

        System.out.println("Smallest Number in Array " + min );
    }
}

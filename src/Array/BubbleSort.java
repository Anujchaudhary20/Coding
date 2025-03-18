package Array;

public class BubbleSort {

    public static void main(String[] args) {
        int arr [] = {4,6,2,3,43,32,23,3,45,6,7,8,9,5,};
        for (int i = 0;i< arr.length-1;i++){
            for (int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                }
            }
        System.out.println("Sorted Array is ");
        for (int num:arr) {
            System.out.print(num + " ");
        }
        }
    }

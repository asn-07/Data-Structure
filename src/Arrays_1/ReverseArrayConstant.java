package Arrays_1;

import java.util.Arrays;

public class ReverseArrayConstant {
    //Given an Array of size N, Reverse the array using constant extra space

    /*
    * Observations :
    * 1st element to Last Position    &&  Last element to 1st Position
    * 2nd element to Last-1 Position   &&  Last-1 Element to 2nd Position
    *
    * in terms of index
    * (i)'th element to (N-i-1)'th
    *
    * if we are using for loop and if we iterate fully then at the end of the array we will get same array.
    *
    * */


    public static void main(String[] args) {
        int[] arr = {3, -2, 1, 4, 3, 6, 8};

        System.out.println("Original Array - > "+Arrays.toString(arr));

        System.out.println("Reversed with For Loop -> "+Arrays.toString(reverseForLoop(arr)));

        //Reverse of reverse = Same Array
        System.out.println("Reversed with While Loop -> "+Arrays.toString(reverseWhileLoop(arr,0, arr.length-1)));

        //Reverse only part of array
        System.out.println("Reversed part of array using While Loop -> "+Arrays.toString(reverseWhileLoop(arr,2, 4)));

    }

    public static int[] reverseWhileLoop(int[] arr, int begin, int end) {
        int i = begin;
        int j = end;
        int temp = 0;
        while (i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static int[] reverseForLoop(int[] arr) {
        int temp = 0;
        for (int i = 0; i< arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }


}

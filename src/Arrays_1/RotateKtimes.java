package Arrays_1;

import java.util.Arrays;

public class RotateKtimes {
    // Given an Array of size N, Rotate the array in clockwise direction by 'K' times

    /*
     *
     * Step 1 : Reverse the Whole Array using ReverseArrayConstant Class
     *
     * Step 2 : Reverse array from 0 to K-1
     *
     * Step 3 :  Reverse array from k to N-1
     *
     * k=2
     * [a0,a1,a2,a3,a4,a5,a6]
     *
     * Step 1 : [a6,a5,a4,a3,a2,a1,a0]
     *
     * Step 2 : [a5,a6,a4,a3,a2,a1,a0]
     *
     * Step 3 : [a5,a6,a0,a1,a2,a3,a4]
     *
     * */


    public static void main(String[] args) {
        int[] arr = {3, -2, 1, 4, 3, 6, 8};
        int k = 2;

        System.out.println("Original Array - > " + Arrays.toString(arr));

        System.out.print("Resulting array when we rotate it by " + k + "times ->");

        //Step1 :  Reverse Whole array
        ReverseArrayConstant.reverseForLoop(arr);

        //Step 2 : Reverse from (0 to k-1)
        ReverseArrayConstant.reverseWhileLoop(arr, 0, k - 1);

        //Step 3 : Reverse from (k to length-1)
        System.out.println(Arrays.toString(ReverseArrayConstant.reverseWhileLoop(arr, k, arr.length - 1)));
    }
}

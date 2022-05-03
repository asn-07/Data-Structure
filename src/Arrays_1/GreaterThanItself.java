package Arrays_1;

public class GreaterThanItself {
    //Given an array of N size,
    // Count the number of elements which have at least one element greater than itself

    /*
    * Step 1 :  Find the max Element
    * Step 2 : Count the max Element repetitions
    * step 3 : (Size - CountMax) ----> is the final Answer
    *
    * Iterations - > 2N
    * Time Complexity  - > O(N)
    * Space Complexity - > O(1)
    *
    * */

    public static void main(String[] args) {
        int [] arr = {-2, 5, 4, 8, 9, 0, 5, 8, 9, 4, 2, 5};
        System.out.println("Size of the original array is "+arr.length);

        System.out.print("Number of Elements which have atleast one element greater than itself are - >");
        System.out.println(greaterThanItself(arr));
    }

    public static int greaterThanItself(int [] arr){

        //Step 1 : Find the max Element
        int max = arr[0];
        for(int i=1; i< arr.length; i++){
            if (arr[i]>max)
                max = arr[i];
        }

        //Step 2 : Count the max Element repetitions
        int cMax = 0;
        for(int i=0; i< arr.length; i++){
            if (arr[i]==max)
                cMax++;
        }

        //Step 3 : (Size - CountMax) ----> is the final Answer
        return arr.length-cMax;
    }
}

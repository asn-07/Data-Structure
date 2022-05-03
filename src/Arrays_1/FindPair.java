package Arrays_1;

public class FindPair {
    //Given an array of N size, and a number K, return true if there exists a pair arr[i] , arr[j] such that
    //arr[i]+arr[j] = k && i != j, else return false.


    /*
    * Since this is completely related to array we have to go with 2 for loop approach.
    * Iterations = (N-1)N/2
    * Time complexity = O(N^2)
    * Space Complexity = O(1)
    * */

    public static void main(String[] args) {
        int[] arr = {3, -2, 1, 4, 3, 6, 8};
        int k = 10;

        System.out.println("Does the given array contains such pair? ");
        System.out.println(findPair(arr,k));
    }

    public static boolean findPair(int[] arr, int k){
        for (int i = 0; i< arr.length; i++){
            for(int j =i+1; j< arr.length; j++){
                if (arr[i]+arr[j]==k){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                    return true;
                }
            }
        }
        return false;
    }
}

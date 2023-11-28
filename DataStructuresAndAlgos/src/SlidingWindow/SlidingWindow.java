package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SlidingWindow {

    public static void main(String[] args){
        // write your code here
        /*
        Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous subarray of size ‘k’.
         */

        double[] results =  averageSubArray(new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 }, 5);
        System.out.println("averages is: "+ Arrays.toString(results));
        System.out.println("********************************************************************************************");

        final int value = 2;
        int maxSum = maxSumSubArray(new int[]{2, 3, 4, 1, 5},value);
        System.out.println("max sum is:" + maxSum);

        System.out.println("********************************************************************************************");

        System.out.println("smallest sub array is: "+smallestSubArray(new int[]{2, 1, 5, 2, 3, 2}, 7));

        /********* nearby  sub array ****** */

        int[] myArry ={1,2,3,1 };
        System.out.println(" nearby duplicates " + containsNearbyAlmostDuplicate(myArry, 3, 0 ));


        reverseArray();


    }


    static double[] averageSubArray(int[]arr, int k){

        double[] result = new double[arr.length -k + 1];

        double windowSum = 0;
        int windowStart = 0;

        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
            windowSum += arr[windowEnd]; //add next element
            if(windowEnd >= k -1){
                result [windowStart] = windowSum / k; //calculate average
                windowSum-= arr[windowStart];//subtract element going out
                windowStart++;//slide window ahead
            }
        }
        return result;
    }

    static int maxSumSubArray(int[]arr, int j){
        int maxSum=0;
        int windowStart=0;
        int windowSum=0;

        for (int windowEnd = 0; windowEnd<arr.length;windowEnd++){
            windowSum+=arr[windowEnd];
            if(windowEnd >= j - 1){
                if(maxSum <= windowSum){
                    maxSum = windowSum;
                }
                windowSum-=arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }


    static int smallestSubArray(int[] arr, int S){
        /*revisit logic... Time complexity is O(N+N) which is equivalent to O (N) */

        int windowStart=0;
        int subArrayCount = 0;
        int subArraySum=0;

        for( int windowEnd =0; windowEnd < arr.length; windowEnd++){

            subArraySum+=arr[windowEnd];

            while(subArraySum >= S){
                subArrayCount = (windowEnd - windowStart + 1);
                subArraySum -= arr[windowStart];
                windowStart++;
            }
        }
        return subArrayCount ;
    }

    public static  boolean  containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {


        int windowStart = 0;

        for (int windowEnd = 0; windowEnd<nums.length; windowEnd++){

            if((windowStart != windowEnd) && ((windowStart - windowEnd) <= indexDiff) &&
                    ((nums[windowStart] - windowEnd) <= valueDiff) ){
                return true;
            }
            windowStart++;

        }

        return false;

    }






     public static int[] reverseArray(){

        int[] nums ={1,2,3,4,5,6};

         int E = nums.length -1;

        for( int i = 0; i < nums.length/2; i++){

            int startValue = nums[i];
            int endValue = nums[E];
            nums[i]= endValue;
            nums[E] = startValue;
            E--;
        }

         for (int num: nums ) {
             System.out.println("---->>>"+num);
         }

        return null;
     }


}

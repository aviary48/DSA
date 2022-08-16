import java.util.Arrays;
import java.util.List;

public class SlidingWindow {

    public static void main(String [] args){


       double[] results =  averageSubArray(new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 }, 5);
        System.out.println("averages is: "+ Arrays.toString(results));

        System.out.println("====================================================================");

        final int value = 2;

        int maxSum = maxSumSumSubArray(new int[]{2, 3, 4, 1, 5},value);

        System.out.println("max sum is:" + maxSum);





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


   static int maxSumSumSubArray(int[]arr, int j){
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



    /*
        Given an array of positive integers and a number ‘S,’ find the length of the smallest contiguous
        subarray whose sum is greater than or equal to ‘S’. Return 0 if no such subarray exists
        */
    static int lengthOfSmallestSubArray(int[] arr, int val){
        int smallestLength = 0;
        int subArrSum=0;
        int windowStart = 0;

        for(int windowEnd =  0; windowEnd< arr.length; windowEnd++){

            subArrSum+= arr[windowEnd];//sum values of array

            if(subArrSum >= val -1){
                smallestLength = windowEnd;
                subArrSum-=arr[windowStart];
                windowStart++;
            }


        }

        return smallestLength;
    }



}




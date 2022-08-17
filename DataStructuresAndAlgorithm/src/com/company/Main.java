package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
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


}

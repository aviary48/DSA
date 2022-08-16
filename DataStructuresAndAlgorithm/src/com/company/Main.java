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






}

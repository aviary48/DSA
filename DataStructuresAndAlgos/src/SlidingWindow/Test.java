package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {


    public static void main(String[] args){

        String [] uuu = {"aa", "bab", "cde", "aba", "ab"};


        System.out.println(solution(uuu));

    }




    public static boolean solution(String[] arr) {
        return checkPalindrome(Arrays.asList(arr));
    }

     static boolean checkPalindrome(List<String> array){
        if(array.size()==0 || array.size()==1)
            return true;
        if(array.size()==2){
            return array.get(0).equals(array.get(1)) ||
                    array.get(0).substring(0,array.get(0).length()-1).equals(array.get(0).substring(array.get(0).length()-1)+array.get(1)) ||
                    (array.get(0)+array.get(1).substring(0,1)).equals(array.get(1).substring(1));

        }
        boolean result = false;
        String first = array.get(0);
        String last = array.get(array.size()-1);
        String second = array.get(1);
        String secondLast = array.get(array.size()-2);
        int wSize = array.size();

        if(first.equals(last)){
            List<String> filtered =copy(array, 1, wSize-1);
            result = result||checkPalindrome(filtered);
        }

        String firstShort = first.substring(0,first.length()-1);
        String secondLong = first.charAt(first.length()-1) + second;
        String firstLong = first + second.charAt(second.length()-1);
        String secondShort = second.substring(1);
        String lastShort = last.substring(1);
        String secondLastLong = secondLast + last.charAt(0);
        String lastLong = secondLast.substring(secondLast.length()-1) + last;
        String secondLastShort = secondLast.substring(0,secondLast.length()-1);

        if(firstShort.equals(last)){
            List<String>filtered = copy(array, 1,wSize-1);
            filtered.add(0,secondLong);
            result = result||checkPalindrome(filtered);
        }

        if(firstShort.equals(lastShort)){
            List<String>filtered = copy(array, 2,wSize-2);
            filtered.add(0,secondLong);
            filtered.add(secondLastLong);
            result = result||checkPalindrome(filtered);
        }

        if(firstShort.equals(lastLong)){
            List<String>filtered = copy(array, 2,wSize-2);
            filtered.add(0,secondLong);
            filtered.add(secondLastShort);
            result = result||checkPalindrome(filtered);
        }

        if(first.equals(lastShort)){
            List<String>filtered = copy(array, 1,wSize-2);
            filtered.add(secondLastLong);
            result = result||checkPalindrome(filtered);
        }

        if(first.equals(lastLong)){
            List<String>filtered = copy(array, 1,wSize-2);
            filtered.add(secondLastShort);
            result = result||checkPalindrome(filtered);
        }

        if(firstLong.equals(last)){
            List<String>filtered = copy(array, 2,wSize-1);
            filtered.add(0,secondShort);
            result = result||checkPalindrome(filtered);
        }

        if(firstLong.equals(lastShort)){
            List<String>filtered = copy(array, 2,wSize-2);
            filtered.add(0,secondShort);
            filtered.add(secondLastLong);
            result = result||checkPalindrome(filtered);
        }

        if(firstLong.equals(lastLong)){
            List<String>filtered = copy(array, 2,wSize-2);
            filtered.add(0,secondShort);
            filtered.add(secondLastShort);
            result = result||checkPalindrome(filtered);
        }

        return result;
    }

    public static List<String> copy(List<String> elements, int start, int end){
        List<String> result = new ArrayList<String>();
        for(int i=start;i<end;i++ ){
            result.add(elements.get(i));
        }
        return result;
    }
}
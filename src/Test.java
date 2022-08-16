import java.util.HashMap;
import java.util.Map;

public class Test {



    public static int removeDuplicates(int[] nums) {

        int length = 0;

        Map<Integer, Integer> myHm = new HashMap<Integer, Integer>();


        for (int i = 0; i < nums.length; i++) {

            if (!myHm.containsKey(nums[i])) {

                myHm.put(nums[i],i);
            }



        }

        System.out.println("the hash map:"+myHm);


        length = myHm.size();
        return length;
    }






    public static int removeElement(int[] nums, int val) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;

    }







    public static  void main(String[] args) {

        int[] num = {3,2,2,3};

        int val = 2;



      //System.out.println("the length is: "+removeDuplicates(num));

        System.out.println("the value is : "+removeElement(num, val));


    }



}

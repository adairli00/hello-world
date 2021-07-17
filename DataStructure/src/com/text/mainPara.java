package com.text;

public class mainPara {
    public int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i+1; j <nums.length ; j++) {

                if (nums[i] ==nums[j]){
                    count++;
                }
            }
            if (count>=nums.length/2){


                return nums[i];


            }


        }
        return -1;


    }

    public static void main(String[] args) {
        int[] a = {2,2,1,1,1,2,2};
        mainPara mainPara = new mainPara();
        int i = mainPara.majorityElement(a);
        System.out.println(i);

    }
}

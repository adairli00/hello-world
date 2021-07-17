package com.day02;

public class Test02 {
    public static void main(String[] args) {
        int[] nums={1,0,3,4,0,5,0,0,2};
        int j=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0){
                //交换位置
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
    }
}

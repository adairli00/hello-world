package com.day02;

public class Test01 {
    public static void main(String[] args) {
        //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
        //输入: [0,1,0,3,12]
        //双指针操作 i j记录0元素的位置
        int[] nums={1,0,3,4,0,5,0,0,2};
        int j=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0){
                if(i!=j){
                    nums[j]=nums[i];
                    nums[i]=0;
                }
                j++;
            }
        }

    }
}

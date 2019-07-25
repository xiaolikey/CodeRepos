package top.xiaolikey.simple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P217 {
    /*
    public boolean containsDuplicate(int[] nums) {
        if(nums.length <= 1) return false;
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }*/
     public boolean containsDuplicate(int[] nums) {
        if(nums.length <= 1) return false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}

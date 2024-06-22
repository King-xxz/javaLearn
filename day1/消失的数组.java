package java数据结构.day1;

public class 消失的数组 {
    class Solution {
        public int missingNumber(int[] nums) {
            int sum=0;
            int a=nums.length;
            for(int i=0;i<a;i++){
                sum+=i-nums[i];
            }
            sum+=a;
            return sum;
        }
    }
}

package java数据结构.day1;

public class Test {
    class Solution {
        //力扣轮换数组
        public void rotate(int[] nums, int k) {
            int len=nums.length;
            int l=len-k;
            while(l<0){
                l+=len;
                k-=len;
            }
            int[] nums2=new int[l];
            for(int i=0;i<l;i++){
                nums2[i]=nums[i];
            }
            for(int i=0;i<k;i++){
                nums[i]=nums[l+i];
            }
            for(int i=0;i<l;i++){
                nums[k+i]=nums2[i];
            }
        }
    }
}

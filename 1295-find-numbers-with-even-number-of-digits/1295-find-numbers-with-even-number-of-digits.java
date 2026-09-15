class Solution {
    public int findNumbers(int[] nums) {
       
        int count2=0;
        int num=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            while(nums[i]>0){
                nums[i]/=10;
                count++;
            }
            if(count%2==0){
                count2++;
            }
        }
        return count2;
    }
}
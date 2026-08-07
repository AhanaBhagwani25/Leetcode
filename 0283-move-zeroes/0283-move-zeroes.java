class Solution {
    public int[] moveZeroes(int[] nums) {
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                list.add(nums[i]);
            }
            else if(nums[i]==0){
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            list.add(0);
        }
        
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        
        return nums;
       

    }
}

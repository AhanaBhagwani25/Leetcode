class Solution {
        public int[] searchRange(int[] nums,int target){
        int[] ans={-1,-1};
        int st=firstOccurence(nums,target,true);
        int end=firstOccurence(nums,target,false);
        ans[0]=st;
        ans[1]=end;
        return ans;

    }
    int firstOccurence(int[] nums,int target,boolean a ){
        int ans=-1;
        int st=0;
        int end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target<nums[mid]){
                end=mid-1;

            }
            else if(target>nums[mid]){
                st=mid+1;
            }
            else{
                ans=mid;
                if(a){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }

            }
        }
        return ans;
    }
}
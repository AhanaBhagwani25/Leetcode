class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<=m-1;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<=n-1;i++){
            list.add(nums2[i]);
        }
        
        for(int i=0;i<list.size();i++){
            nums1[i]=list.get(i);
        }
        Arrays.sort(nums1);
        return nums1;
        
    }

}
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st=0;
        int end=2;
        while(end<arr.length){
            if(arr[st]<arr[st+1] && arr[st+1]>arr[end]){
                return st+1;
            }
            st++;
            end++;
        }
        return -1;
    }
}
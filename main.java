class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int numsmerge[]=new int[nums1.length+nums2.length];
        int index=0;
        int i=0;
        int j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<=nums2[j]){
                numsmerge[index++]=nums1[i];
                i++;
            }else if(nums2[j]<nums1[i]){
                numsmerge[index++]=nums2[j];
                j++;
            }
        }
        while(i < nums1.length) {
    numsmerge[index++] = nums1[i++];
}

while(j < nums2.length) {
    numsmerge[index++] = nums2[j++];
}
        int n=numsmerge.length;
        double median;
        if(n%2==1){
            median=(double)numsmerge[n/2];
        }else{
            median=(double)(numsmerge[n/2]+numsmerge[(n/2)-1])/2;
        }
        return median;
        }
        public static void main(String[] args){
            int nums1[]={1,2};
            int nums2[]={3,4};
            int numsmerge[]=new int[nums1.length+nums2.length];
            double median=findMedianSortedArrays(nums1,nums2);
        }
    }

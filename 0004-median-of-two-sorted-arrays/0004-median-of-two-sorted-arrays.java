class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0;
        int i = 0;
        int j = 0;
        int[] arr = new int[nums1.length+nums2.length];
        int pos = 0;

        while(i< nums1.length && j< nums2.length){
            if(nums1[i]<=nums2[j]){
                arr[pos] = nums1[i];
                i++;
                pos++;
            }else{
                arr[pos] = nums2[j];
                j++;
                pos++;
            }
        }
        
        while(i< nums1.length ){
            arr[pos] = nums1[i];
            i++;
            pos++;
        }

        while(j< nums2.length){
            arr[pos] = nums2[j];
            j++;
            pos++;
        }
        System.out.println(Arrays.toString(arr));

        if (arr.length == 1){
            return arr[0];
        }
       
        int mid =  (arr.length-1)/2;
        ans = ((arr.length ) % 2 ==0) ? (double)(arr[mid]+arr[mid+1] )/2 :  (double)arr[mid] ;
        
        return ans;
    }
}
class Solution {
    public int trap(int[] height) {
        int waters = 0;
        int n =height.length;
        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        System.out.println(Arrays.toString(rightMax));
        int leftMax = height[0];
        for (int j = 0; j < height.length; j++) {

            waters+=Math.max(0,Math.min(rightMax[j],leftMax)-height[j]);
            leftMax =  Math.max(leftMax,height[j]);
        }
        return waters;
    }
}
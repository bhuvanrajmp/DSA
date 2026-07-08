class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int size = 2 * nums.length;
        int[] ans= new int[size];
        int j =0;
        for (int i = 0 ; i<size; i++)
        {
            if (j<nums.length){
                ans[i]=nums[j];
                j++; 
            }
            else {
                j=0;
                ans[i]=nums[j];
                j++;
            }
            
        }
        return ans;

    }
}
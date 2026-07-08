class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        //  if input 2 5 1 3 4 7 
 
        int[] ans = new int[nums.length];
        int j = 0;
        for (int i =0 ; i < n ;i++){
            ans[j]= nums[i];
            ans[j+1] = nums[i+n];
            j=j+2;
        }
    

        // out put 2 3 5 4 1 7 
        return ans;

    }
}
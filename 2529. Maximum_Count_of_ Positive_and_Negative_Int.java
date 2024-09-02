class Solution {
    public int maximumCount(int[] nums) {
        int count = 0;
        int cunt = 0;
        int ans = 0;
        for(int i=0; i<=nums.length-1; i++){
        if(nums[i] < 0){
            count++;
        }else if(nums[i] > 0){
            cunt++;
        }
        }
        if(count < cunt){
            ans  = cunt;
            }else if(count == cunt){
                ans = count;
        }else{
            ans = count;
        }
        return ans;
    }
}

class Solution {
    public int climbStairs(int n) {
        if(n <= 1){
            return 1;
        }
        int n0 = 1;
        int n1 = 1;
        int current = 0;
        for(int i = 2; i <= n; i++){
            current = n0 + n1;
            n0 = n1;
            n1 = current;
        }
        return current;
    }
}

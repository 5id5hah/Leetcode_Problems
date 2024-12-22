class Solution {
    public boolean canMeasureWater(int jug1, int jug2, int target) {
        
        if (target > jug1 + jug2) {
            return false;
        }
        
       
        return target % gcd(jug1, jug2) == 0;
    }
    
   
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
//USING RECURSION
// private int gcd(int a, int b){
// if(b == 0){
// return a;
// }
// return gcd(b,b%a); }

class Solution {
    public int minAddToMakeValid(String s) {
        int count=0,sum=0,ans=0;
        if(s.length() == 0){
            return 0;
        }
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }else if(count > 0){
                count--;
            }
            else{
                sum++;
            }
            
        }
        ans = count+sum;
        return ans;
    }
}

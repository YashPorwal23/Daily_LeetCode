class Solution {
    public int reverseDegree(String s) {
        int ans =0;
        for(int i=0;i<s.length();i++){
            int x = 123-(int)s.charAt(i);
            ans=ans+(x*(i+1));
        }
        return ans;
    }
}
class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        int c = 1;
        int len = word.length();
        while(len>7){
            len-=8;
            ans=ans+(c*8);
            c++;
        }
        ans=ans+(c*len);
        return ans;
    }
}
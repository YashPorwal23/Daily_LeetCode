class Solution {
    public int minimumPushes(String word) {
      int freq[] = new int[26];
      for(int i=0;i<word.length();i++){
        freq[word.charAt(i)-'a']++;
      }
      Arrays.sort(freq);
      int ans = 0;
      int c = 0;
      int temp = 1;
      for(int i=25;i>=0;i--){
        if(freq[i]==0) continue;
        else{
            ans+=(freq[i]*temp);
            c++;
        if(c==8){
            temp++;
            c=0;
        }
        }
      }
      return ans;
    }
}
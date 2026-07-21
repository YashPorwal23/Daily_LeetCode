class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sb = new StringBuilder();
        int c = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==x){
                c++;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        while(c-->0){
            sb.append(x);
        }
        return sb.toString();
    }
}
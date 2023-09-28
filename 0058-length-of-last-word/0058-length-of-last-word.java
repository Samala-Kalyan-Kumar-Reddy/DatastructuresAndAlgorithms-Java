class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0) return 0;
          String[]s1=s.split("\\s+");
        int count =s1[s1.length-1].length();

return count;
        
    }
}
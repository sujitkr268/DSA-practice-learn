class Solution {
    public String reverseWords(String s) 
    {
        String ans = "";
        String[] words= s.trim().split("\\s+");
        for(int i=words.length - 1;i>=0;i--)
        {
            ans+=words[i]+" ";
        }
          String ans1=ans.trim(); 
        return ans1;
        
    }
}
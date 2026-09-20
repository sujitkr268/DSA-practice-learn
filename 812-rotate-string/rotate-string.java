class Solution {
    public boolean rotateString(String s, String goal)
     {
       int l1=s.length();
       int l2=goal.length();
       if(l1!=l2)
       {
        return false;
       } 
       else
       {
        if((s+s).contains(goal))
        {
            return true;
        }
        else
        return false;
       }

    }
}
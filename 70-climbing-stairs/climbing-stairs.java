class Solution {
    public int climbStairs(int n) {
        // Base cases: 1 way for 1 step, 2 ways for 2 steps
        if (n <= 2) {
            return n;
        }
        
        int prev2 = 1; // Ways to reach (n-2)th step
        int prev1 = 2; // Ways to reach (n-1)th step
        int current = 0;
        
        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2; // Recurrence relation
            prev2 = prev1;           // Move prev2 forward
            prev1 = current;         // Move prev1 forward
        }
        
        return current;
    }
}

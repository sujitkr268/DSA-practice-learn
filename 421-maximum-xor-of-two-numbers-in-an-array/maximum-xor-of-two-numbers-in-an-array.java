class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[2];
    }
    
    public int findMaximumXOR(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        
        TrieNode root = new TrieNode();
        
        for (int num : nums) {
            TrieNode curr = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (curr.children[bit] == null) {
                    curr.children[bit] = new TrieNode();
                }
                curr = curr.children[bit];
            }
        }
        
        int maxXOR = 0;
        
        for (int num : nums) {
            TrieNode curr = root;
            int currentXOR = 0;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                int toggleBit = bit ^ 1;
                if (curr.children[toggleBit] != null) {
                    currentXOR |= (1 << i);
                    curr = curr.children[toggleBit];
                } else {
                    curr = curr.children[bit];
                }
            }
            maxXOR = Math.max(maxXOR, currentXOR);
        }
        
        return maxXOR;
    }
}

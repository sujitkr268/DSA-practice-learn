class Solution {
    public String removeOuterParentheses(String s) {

        String ans = "";
        int depth = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {

                if (depth != 0) {
                    ans += ch;
                }

                depth++;
            }

            else {

                depth--;

                if (depth != 0) {
                    ans += ch;
                }
            }
        }

        return ans;
    }
}
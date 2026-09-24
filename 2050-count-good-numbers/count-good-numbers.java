class Solution {

    static final long MOD = 1000000007L;

    public int countGoodNumbers(long n) {

        long even = (n + 1) / 2;
        long odd = n / 2;

        long ans1 = power(5, even);
        long ans2 = power(4, odd);

        return (int)((ans1 * ans2) % MOD);
    }

    public long power(long x, long n) {

        long ans = 1;

        while (n > 0) {

            if (n % 2 == 1) {
                ans = (ans * x) % MOD;
            }

            x = (x * x) % MOD;
            n = n / 2;
        }

        return ans;
    }
}
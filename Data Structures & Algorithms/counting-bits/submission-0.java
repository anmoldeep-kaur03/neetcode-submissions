class Solution {
    public int[] countBits(int n) {
        int[] bit = new int[n+1];
        for(int i = 0; i<=n; i++){
            bit[i] = bits(i);
        } 
        return bit;
    }

    public int bits(int n){
        int res = 0;
        while (n != 0) {
            n &= n - 1;
            res++;
        }
        return res;
    }
}

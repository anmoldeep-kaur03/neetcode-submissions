class Solution {
    public int getSum(int a, int b) {
        while(b != 0){
            int carry = (a & b) << 1;
            System.out.println("carry" + carry);
            a ^= b;
            System.out.println("a" + a);
            b = carry;
        }
        return a;
    }
}

class Solution {
    public int solution(int n) {
        String radix_3 = Integer.toString(n, 3);
        String rev_3 = new StringBuilder(radix_3).reverse().toString();
        int radix_10 = Integer.parseInt(rev_3, 3);
        return radix_10;
    }
}
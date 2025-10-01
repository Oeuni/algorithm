class Solution {
    public int solution(int n) {
        double num = Math.sqrt(n);
        return num % 1 == 0 ? 1 : 2;
    }
}
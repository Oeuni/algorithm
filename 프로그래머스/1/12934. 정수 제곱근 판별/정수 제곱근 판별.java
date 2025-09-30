class Solution {
    public long solution(long n) {
        double answer = 0;
        answer = Math.sqrt(n);

        return answer % 1 == 0 ? (long)Math.pow(answer+1, 2) : -1;
    }
}
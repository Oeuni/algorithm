class Solution {
    public boolean solution(int x) {
        String s = x + "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
			sum += Integer.parseInt(s.charAt(i)+"");
		}
        return x % sum == 0;
    }
}
class Solution {
    public String solution(String s) {
        char[] c = new char[s.length()];
        char temp;
        
        for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}
        for (int i = 0; i < c.length-1; i++) {
        	for (int j = 0; j < c.length-1; j++) {
        		if (c[j] < c[j+1]) {
        			temp = c[j];
        			c[j] = c[j+1];
        			c[j+1] = temp;
        		}
			}
		}
        return new String(c);
    }
}
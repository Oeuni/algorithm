class Solution {
    boolean solution(String s) {
        String str = s.toLowerCase();
        
        int pCnt = 0;
        int yCnt = 0;

        for (int i = 0; i < s.length(); i++) {
			if (str.charAt(i) == 'p') {
				pCnt++;
			}
			else if (str.charAt(i) == 'y') {
				yCnt++;
			}
		}

        return pCnt == yCnt;
    }
}
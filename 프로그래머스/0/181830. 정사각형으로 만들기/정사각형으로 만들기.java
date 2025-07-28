class Solution {
    public int[][] solution(int[][] arr) {
    	int a = arr.length;		//행
    	int b = arr[0].length;	//열
    	
        int[][] answer = new int[Math.max(a, b)][Math.max(a, b)];
        
    	for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				answer[i][j] = arr[i][j];
			}
		}
        return answer;
    }
}
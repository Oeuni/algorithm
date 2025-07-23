class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        String lr = "";
        int idx = 0;
        
        // l, r 중 먼저 나오는 것 찾기
        for (int i = 0; i < str_list.length; i++) {
			if (str_list[i].equals("l")) {
				lr = "l";
				idx = i;
				break;
			}
			else if (str_list[i].equals("r")) {
				lr = "r";
				idx = i;
				break;
			}
		}
        if (lr.equals("")) return answer;

        if (lr.equals("l")) {
        	answer = new String[idx];
        	for (int i = 0; i < answer.length; i++) {
				answer[i] = str_list[i];
			}
        }
        else if (lr.equals("r")) {
        	answer = new String[str_list.length-idx-1];
        	for (int i = 0; i < answer.length; i++) {
				answer[i] = str_list[idx+i+1];
			}
        } 
        return answer;
    }
}
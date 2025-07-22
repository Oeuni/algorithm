import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<String>();
        String tmp = "";
        
        for (int i = 0; i < myStr.length(); i++) {
			if (myStr.charAt(i) != 'a' && myStr.charAt(i) != 'b' && myStr.charAt(i) != 'c') {
				tmp += myStr.charAt(i);
			}
			else if (!tmp.isEmpty()){
				list.add(tmp);
				tmp = "";
			}
			if (!tmp.isEmpty() && i == myStr.length()-1) list.add(tmp);
		}
        
        String[] answer = {};
        if (list.size() == 0) {
        	answer = new String[1];
        	answer[0] = "EMPTY";
        }
        else {
        	answer = new String[list.size()];
        	
        	for (int i = 0; i < list.size(); i++) {
				if (!list.get(i).isEmpty()) {
					answer[i] = list.get(i);
				}
			}
        }
        return answer;
    }
}
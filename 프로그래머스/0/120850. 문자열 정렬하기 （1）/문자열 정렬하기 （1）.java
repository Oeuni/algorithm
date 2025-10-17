import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
			int a = my_string.charAt(i)-48;
        	if (a >= 0 && a < 10) {
        		list.add(a);
        	}
		}
        list.sort(null);
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}
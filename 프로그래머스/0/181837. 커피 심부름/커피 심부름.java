import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        Set<String> ame = new HashSet<>();
        Collections.addAll(ame, "iceamericano", "americanoice", "hotamericano", "americanohot", "americano", "anything");
        
        Set<String> latte = new HashSet<>();
        Collections.addAll(latte, "icecafelatte", "cafelatteice", "hotcafelatte", "cafelattehot", "cafelatte");
        
        for (int i = 0; i < order.length; i++) {
        	if (ame.contains(order[i])) {
        		answer += 4500;
        	}
        	else {
        		answer += 5000;
        	}
		}
        return answer;
    }
}
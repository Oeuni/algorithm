import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        
        int n = map.get(ext);
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
			if (data[i][n] <= val_ext) {
				list.add(data[i]);
			}
		}
        
        int m = map.get(sort_by);
        
        list.sort((a, b) -> Integer.compare(a[m], b[m]));
        
        int[][] answer = list.toArray(new int[list.size()][]);

        return answer;
    }
}
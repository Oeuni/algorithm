import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<int[]> list = new ArrayList<int[]>();
    	
    	for (int i = 0; i < attendance.length; i++) {
			if (attendance[i]) {
				list.add(new int[]{rank[i], i});	// 등수, 인덱스
			}
		}
    	
    	list.sort(Comparator.comparingInt(a -> a[0]));
    	
    	int a = list.get(0)[1];
    	int b = list.get(1)[1];
    	int c = list.get(2)[1];

        return 10000*a + 100*b + c;
    }
}
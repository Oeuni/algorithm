import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		List<Integer> list = new ArrayList<>();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		
		sb.append("<");
		int idx = K-1;
		while (list.size() != 0) {
			if (idx >= list.size()) idx %= list.size();
			if (list.size() == 1) {
				sb.append(list.remove(idx));
			}
			else {
				sb.append(list.remove(idx) + ", ");
			}
			idx += K-1;
		}
		System.out.println(sb.append(">"));
	}
}
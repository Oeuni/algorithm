import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] tree = new int[N];
		st = new StringTokenizer(br.readLine());
		int maxTree = 0;
		for (int i = 0; i < N; i++) {
			int iptTree = Integer.parseInt(st.nextToken());
			if (maxTree < iptTree) maxTree = iptTree;
			tree[i] = iptTree;
		}
		
		int left = 0;
		int right = maxTree;
		int answer = 0;
		while (left <= right) {
			int mid = (left + right) / 2;
			long sum = 0;
			
			for (int i = 0; i < tree.length; i++) {
				if (tree[i] > mid) sum += (tree[i]-mid);
			}
			
			if (sum >= M) {
				answer = mid;
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		System.out.println(answer);
	}
}
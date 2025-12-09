import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트 케이스
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			// 문서의 개수
			int N = Integer.parseInt(st.nextToken());
			// 몇 번째로 인쇄되었는지 궁금한 문서가 현재 Queue에서 몇 번째에 놓여 있는지를 나타내는 정수
			int M = Integer.parseInt(st.nextToken());
			
			Deque<int[]> deque = new ArrayDeque<>();
			Integer[] tempArr = new Integer[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int priority = Integer.parseInt(st.nextToken());
				deque.offer(new int[]{priority, j});
				tempArr[j] = priority;
			}
			
			Arrays.sort(tempArr, Collections.reverseOrder());
			
			int cnt = 0;	 // 출력 카운트
			int idx = 0;	// 찾을 숫자 실제 인덱스
			while (!deque.isEmpty()) {
				int[] cur = deque.poll();
				if (cur[0] == tempArr[idx]) {
					cnt++;
					idx++;
					if (cur[1] == M) {
						System.out.println(cnt);
				        break;
				    }
				}
				else {
					deque.offer(cur);
				}
			}
		}
	}
}
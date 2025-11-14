import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M;
	static int[] arr;      	// 숫자를 담을 배열
	static boolean[] visit; // 방문 여부 확인
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[M];
		visit = new boolean[N + 1]; // 1~N 사용
		
		back(1, 0);
	}
	static void back (int start, int depth) {
		
		if (depth == M) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
        for (int i = start; i <= N; i++) {
            arr[depth] = i;
            back(i + 1, depth + 1); // 다음 숫자는 더 큰 숫자만 허용
        }
	}
}

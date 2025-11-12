import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int result = n*m;
		char[][] bw = new char[n][m];
		
		// 체스판 입력받기
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				bw[i][j] = s.charAt(j);
			}
		}
		for (int i = 0; i <= n-8; i++) {	// 행 순회
			for (int j = 0; j <= m-8; j++) {	// 열 순회
				
				int cntB = 0;
				int cntW = 0;
				
				// 8x8 체스판 순회
				for (int x = i; x < i+8; x++) {	// 열 순회
					for (int y = j; y < j+8; y++) {	// 행 순회
						
						// B로 시작할 때, 짝수칸 B, 홀수칸 W
						// W로 시작할 때, 짝수칸 W, 홀수칸 B
						if ((x + y) % 2 == 0) {	// 짝수 칸
							if (bw[x][y] != 'B') cntB++;
							if (bw[x][y] != 'W') cntW++;
						}
						else {
							if (bw[x][y] != 'W') cntB++;
							if (bw[x][y] != 'B') cntW++;
						}
					}
				}
				result = Math.min(result, Math.min(cntB, cntW));
			}
		}
		System.out.println(result);
	}
}

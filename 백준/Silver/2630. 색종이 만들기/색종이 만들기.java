import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] arr;
	static int cntW = 0;
	static int cntB = 0;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		count(0, 0, N);
		System.out.println(cntW);
		System.out.println(cntB);
		
	}

	static void count(int x, int y, int size) {
	    // 1. 현재 정사각형이 전부 같은 색인지 체크
	    if(checkSame(x, y, size)) {
	    	// 색에 따라 whiteCount 또는 blueCount 증가
	    	int color = arr[x][y];
	    	if (color == 0) cntW++;
	    	else cntB++;
	        return;
	    }

	    // 2. 같지 않으면 4등분
	    int newSize = size / 2;

	    count(x, y, newSize);               // 왼쪽 위
	    count(x, y + newSize, newSize);     // 오른쪽 위
	    count(x + newSize, y, newSize);     // 왼쪽 아래
	    count(x + newSize, y + newSize, newSize); // 오른쪽 아래
	}
	static boolean checkSame(int x, int y, int size) {
	    int color = arr[x][y];

	    // 이 정사각형 전체가 color와 같은지 확인
	    for (int i = x; i < x+size; i++) {
			for (int j = y; j < y+size; j++) {
				if(arr[i][j] != color) return false;
			}
		}
	    return true;
	}
}

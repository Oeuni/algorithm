import java.util.Scanner;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		// 옮긴 횟수 K
		System.out.println((int)Math.pow(2, N) - 1);

		// 원판 수, 시작 기둥, 목표 기둥, 보조 기둥
		hanoi(N, 1, 3, 2);
		
		System.out.println(sb.toString());
	}
	
	static void hanoi(int n, int from, int to, int aux) {
	    if (n == 1) {
	        // from → to 출력
	    	sb.append(from + " " + to + "\n");
	        return;
	    }

	    // 1. n-1개를 from → aux 이동
	    hanoi(n-1, from, aux, to);

	    // 2. 가장 큰 원판 하나를 from → to 이동
	    sb.append(from + " " + to + "\n");
	    
	    // 3. n-1개를 aux → to 이동
	    hanoi(n-1, aux, to, from);
	}
}

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		int c = 0;	// 거스름돈
		
		for (int i = 0; i < n; i++) {
			c = sc.nextInt();
			sb.append((c / 25) + " ");
			c %= 25;
			sb.append((c / 10) + " ");
			c %= 10;
			sb.append((c / 5) + " ");
			c %= 5;
			sb.append(c + "\n");
		}
		
		System.out.println(sb);
	}
}
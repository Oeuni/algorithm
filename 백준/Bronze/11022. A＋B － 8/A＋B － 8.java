import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			sb.append("Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b) + "\n");
		}
		System.out.println(sb);
	}
}
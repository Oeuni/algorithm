import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int a = 0;
		int b = 0;
		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a == 0 && b == 0) break;
			
			if (b % a == 0) {
				sb.append("factor\n");
			}
			else if (a % b == 0) {
				sb.append("multiple\n");
			}
			else {
				sb.append("neither\n");
			}
		}
		System.out.println(sb);
	}
}
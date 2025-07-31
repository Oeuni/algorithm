import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String s = "";
		int x = 0;
		int sum = 0;
		
		while (true) {
			s = sc.next();
			if (s.equals("0")) break;
			
			for (int i = 0; i < s.length(); i++) {
				x = Integer.parseInt(s.charAt(i) + "");
				if (x == 1) {
					sum += 2;
				}
				else if (x == 2) {
					sum += 3;
				}
				else if (x == 0) {
					sum += 4;
				}
				else {
					sum += 3;
				}
			}
			sb.append((sum + 2 + s.length()-1) + "\n");
			sum = 0;
		}
		System.out.println(sb);
	}
}
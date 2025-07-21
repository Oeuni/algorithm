import java.util.Scanner;

// 백준 - 1021:회전하는 큐
public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		int minDiff = Integer.MAX_VALUE;
		
        for (int i = 0; i <= b.length() - a.length(); i++) {
            int diff = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(i + j)) {
                    diff++;
                }
            }
            minDiff = Math.min(minDiff, diff);
        }

		
		System.out.println(minDiff);
	}
}
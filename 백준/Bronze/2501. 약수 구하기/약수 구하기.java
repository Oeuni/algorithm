import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int l = 1;
		
		if (k == 1) {
			System.out.println(1);
		}
		else {
			for (int i = 2; i <= n/2; i++) {
				if (n % i == 0) {
					l++;
					if (l == k) {
						System.out.println(i);
						break;
					}
				}
			}
			if (l+1 == k) {
				System.out.println(n);
			}
			else if (l < k) {
				System.out.println(0);
			}
		}
	}
}
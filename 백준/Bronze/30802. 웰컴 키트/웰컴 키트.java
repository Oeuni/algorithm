import java.util.Scanner;

// 백준 - 30802:웰컴 키트
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 참가자 수
		
		int[] sizeArr = new int[6];
		for (int i = 0; i < 6; i++) {
			sizeArr[i] = sc.nextInt();
		}
		
		int t = sc.nextInt();	// 티셔츠 묶음 수
		int p = sc.nextInt();	// 펜 묶음 수
		
		int tSet = 0;
		
		for (int i = 0; i < sizeArr.length; i++) {
			if (sizeArr[i] % t != 0) {
				tSet += sizeArr[i] / t + 1;
			}
			else {
				tSet += sizeArr[i] / t;
			}
		}

		System.out.println(tSet);
		System.out.println(n / p + " " + n % p);
	}
}
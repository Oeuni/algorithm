import java.util.Scanner;

// 백준 - 2798:블랙잭
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				for (int j2 = j+1; j2 < arr.length; j2++) {
					if (arr[i]+arr[j]+arr[j2] <= m && arr[i]+arr[j]+arr[j2] > max) {
						max = arr[i]+arr[j]+arr[j2];
					}
				}
			}
		}
		
		System.out.println(max);
	}
}
import java.util.Scanner;

// 백준 - 1547:공
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {1, 2, 3};
		int n = sc.nextInt();
		int a = 0, b = 0, temp = 0;
		
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			temp = arr[a-1];
			arr[a-1] = arr[b-1];
			arr[b-1] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] == 1) {
		        System.out.println(i+1);
		        break;
		    }
		}
	}
}
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// 백준 - 10845:큐
public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		Deque<Integer> que = new ArrayDeque<>();
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			String cm = sc.next();
			switch (cm) {
			case "push":
				int x = sc.nextInt();
				que.add(x);
				break;
			case "pop":
				if (que.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(que.poll());
				}
				break;
			case "size":
				System.out.println(que.size());
				break;
			case "empty":
				if (que.isEmpty()) {
				    System.out.println(1);
				} else {
				    System.out.println(0);
				}
				break;
			case "front":
				if (que.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(que.peek());
				}
				break;
			case "back":
				if (que.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(que.peekLast());
				}
				break;

			default:
				break;
			}
		}

	}
}
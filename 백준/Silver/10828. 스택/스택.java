import java.util.Scanner;
import java.util.Stack;

// 백준 - 10828:스택
public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stk = new Stack<>();
		
		int n = sc.nextInt();
		
		String prompt = "";
		for (int i = 0; i < n; i++) {
			prompt = sc.next();
			
			switch (prompt) {
			case "push":
				int a = sc.nextInt();
				stk.add(a);
				break;
			case "pop":
				if (stk.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(stk.pop());
				}
				break;
			case "size":
				System.out.println(stk.size());
				break;
			case "empty":
				if (stk.isEmpty()) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
				break;
			case "top":
				if (stk.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(stk.peek());
				}
				break;
			default:
				break;
			}
		}
	}
}

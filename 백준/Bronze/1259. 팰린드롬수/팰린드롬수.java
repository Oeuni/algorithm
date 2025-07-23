import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 백준 - 1259:팰린드롬수
public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		List<String> listAns = new ArrayList<String>();
		
		while (true) {
			String a = sc.next();
			if (a.equals("0")) break;
			
			String front = "";
			String back = "";
			if (a.length() % 2 != 0) { //길이가 짝수가 아니면
				a = a.substring(0, a.length()/2) + a.substring(a.length()/2+1);
				
			}
			front = a.substring(0, a.length()/2);
			back = a.substring(a.length()/2);
			String reversed = new StringBuilder(back).reverse().toString();
			
			if (front.equals(reversed)) {
				listAns.add("yes");
			} else {
				listAns.add("no");
			}
		}
		
		for (int i = 0; i < listAns.size(); i++) {
			System.out.println(listAns.get(i));
		}
	}
}
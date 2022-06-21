import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JO_1719 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1719.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		if (n < 0 || n > 100 || n % 2 == 0) {
			System.out.println("INPUT ERROR!");
			return;
		}
		switch (m) {
		case 1:
			Op1(n);
			break;
		case 2:
			Op2(n);
			break;
		case 3:
			Op3(n);
			break;
		case 4:
			Op4(n);
			break;
		default:
			System.out.println("INPUT ERROR!");
			break;
		}
	}
	
	static void Op1(int n) {
		for (int i = 0; i < n; i++) {
			int upto = i + 1;
			if (i > n / 2)
				upto = n - i;
			for (int j = 0; j < upto; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void Op2(int n) {
		for (int i = 0; i < n; i++) {
			int upto = i + 1;
			if (i > n / 2)
				upto = n - i;
			
			for (int j = 0; j < n / 2 - upto + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < upto; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void Op3(int n) {
		for (int i = 0; i < n; i++) {
			int blank = i;
			int star = n - i * 2;
			if (i > n / 2) {
				blank = n - i - 1;
				star = n - 2 * blank;
			}
			for (int j = 0; j < blank; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void Op4(int n) {
		for (int i = 0; i < n; i++) {
			int blank = i;
			int star = n / 2 - i + 1;
			if (i > n / 2) {
				blank = n / 2;
				star = i - n / 2 + 1;
			}
			for (int j = 0; j < blank; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JO_1523 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1523.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		if (n < 1 || n > 100) {
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
		default:
			System.out.println("INPUT ERROR!");
			break;
		}
	}
	
	static void Op1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void Op2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void Op3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

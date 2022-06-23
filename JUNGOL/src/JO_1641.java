import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JO_1641 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1641.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		if (n < 1 || n > 100 | n % 2 ==0) {
			System.out.println("INPUT ERROR!");
			return;
		}
		switch(m) {
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
		int[][] arr = new int[n][n];
		int cont = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j <= i; j++) {
					arr[i][j] = cont++;
				}
			} else {
				for (int j = i; j >= 0; j--) {
					arr[i][j] = cont++;
				}				
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] != 0) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
	
	static void Op2(int n) {
		for (int i = 0; i < n; i++) {
			int blank = i;
			int nums = 2 * n - i - 1;
			for (int j = 0; j < blank; j++) {
				System.out.print("  ");
			}
			for (int j = i; j < nums; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	static void Op3(int n) {
		for (int i = 1; i <= n; i++) {
			int e = i <= n / 2 ? i : n - i + 1;
			for (int j = 1; j <= e; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

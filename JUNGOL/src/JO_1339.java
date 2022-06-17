import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JO_1339 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1339.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (N < 1 || N > 100 || N % 2 ==0) {
			System.out.println("INPUT ERROR");
			return;
		}
		char[][] arr = new char[N][N];
		char c = 'A';
		int d = 0;
		for (int i = N / 2; i >= 0; i--) {
			for (int j = i; j < N - i; j++) {
				arr[j][i] = (char) (c + (d++) % 26);
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= N / 2; j++) {
				if (arr[i][j] != '\u0000')
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

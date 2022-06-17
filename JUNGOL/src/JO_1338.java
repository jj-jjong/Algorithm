import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JO_1338 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1338.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[][] arr = new char[N][N];
		int s = N - 1;
		char c = 'A';
		
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				arr[j][s-j] = c++;
				if (c == 'Z' + 1)
					c = 'A';
			}
			s++;
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 0)
					System.out.print("  ");
				else
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

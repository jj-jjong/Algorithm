import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JO_1337 {
	public static void main(String[] args) throws Exception	{
		System.setIn(new FileInputStream("sample/Sample_1337.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][N];
		
		int cont = 0;
		int lr = 0, lc = 0;
		for (int i = 0; i < N; i += 2) {
			// 빗면
			for (int j = i; j < N - 1 - i / 2; j++) {
				arr[j][j - i / 2] = cont++%10;
			}
			// 수평선
			for (int j = N - 1 - i; j > i / 2; j--) {
				arr[N - i / 2 - 1][j] = cont++%10;
			}
			// 수직선
			for (int j = N - 1 - i / 2; j > i; j--) {
				arr[j][i / 2] = cont++%10;
				lr = j;
				lc = i /2;
			}
		}
		
		if (N % 3 == 1)
			arr[lr + 1][lc + 1] = cont++%10; 
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JO_1707 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1707.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		int cont = 1;
		for (int i = 0; i < n / 2; i++) {
			for (int j = i; j < n - i - 1; j++) {
				arr[i][j] = cont++;
			}
			for (int j = i; j < n - i - 1; j++) {
				arr[j][n - i - 1] = cont++;
			}
			for (int j = i; j < n - i - 1; j++) {
				arr[n - i - 1][n - j - 1] = cont++;
			}
			for (int j = i; j < n - i - 1; j++) {
				arr[n - j - 1][i] = cont++;
			}
		}
		if (n % 2 == 1)
			arr[n / 2][n / 2] = cont;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

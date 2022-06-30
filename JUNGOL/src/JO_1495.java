import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JO_1495 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1495.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		int cont = 1;
		for (int i = 0; i < 2 * n - 1; i++) {
			if (i < n) {
				if (i % 2 == 1) {
					for (int j = 0; j <= i; j++) {
						arr[i - j][j] = cont++;
					}
				} else {
					for (int j = 0; j <= i; j++) {
						arr[j][i - j] = cont++;
					}
				}
			} else {
				if (i % 2 == 1) {
					for (int j = n - 1; j > i - n; j--) {
						arr[j][i - j] = cont++;
					}
				} else {
					for (int j = n - 1; j > i - n; j--) {
						arr[i - j][j] = cont++;
					}					
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

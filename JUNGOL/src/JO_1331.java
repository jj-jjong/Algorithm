import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JO_1331 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1331.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int rc = 2 * N - 1;
		char[][] arr = new char[rc][rc];
		char cont = 'A';
		int add = 0;
		for (int i = 0; i < N - 1; i++) {
			// 좌상
			for (int j = 0; j < N - i - 1; j++) {
				arr[i + j][N - j - 1] = (char) (cont + (add++)%26);
			}
			// 좌하
			for (int j = 0; j < N - i - 1; j++) {
				arr[N + j - 1][j + i] = (char) (cont + (add++)%26);
			}
			// 우하
			for (int j = 0; j < N - i - 1; j++) {
				arr[rc - j - i - 1][N + j - 1] = (char) (cont + (add++)%26);
			}				
			// 우상
			for (int j = 0; j < N - i - 1; j++) {
				arr[N - j - 1][rc - j - i - 1] = (char) (cont + (add++)%26);
			}
		}
		arr[N - 1][N - 1] = (char) (cont + (add++)%26);
		
		
		for (int i = 0; i < rc; i++) {
			for (int j = 0; j < rc; j++) {
				if (arr[i][j] != '\u0000') {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

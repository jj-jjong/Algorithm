import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JO_2074 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_2074.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][N];
		int cont = 0;
		int r = -1;
		int c = N / 2;
		while (cont < N * N) {
			if (cont % N == 0) {
				arr[++r][c] = ++cont;
			} else {
				try {
					arr[r - 1][c - 1] = cont + 1;
					r--;
					c--;
					cont++;
				} catch (Exception e) {
					if (r == 0)
						arr[r = N - 1][--c] = ++cont;
					else if (c == 0)
						arr[--r][c = N - 1] = ++cont;
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

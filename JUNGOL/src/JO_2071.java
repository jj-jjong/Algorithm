import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JO_2071 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_2071.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				try {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				} catch (Exception e) {
					arr[i][j] = 1;
				}
			}
		}
		
		switch (m) {
		case 1:
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			break;
		case 2:
			for (int i = n - 1; i >= 0; i--) {
				for (int j = i; j < n - 1; j++) {					
					System.out.print(" ");
				}
				for (int j = 0; j <= i; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			break;
		case 3:
			for (int i = n - 1; i >= 0; i--) {
				for (int j = n - 1; j >= i; j--) {
					System.out.print(arr[j][i] + " ");
				}
				System.out.println();
			}
			break;
		}
	}
}

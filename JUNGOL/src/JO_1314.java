import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JO_1314 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1314.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char e = 'A';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j % 2 == 0)
					System.out.printf("%c ", e + (i + j * n) % 26);
				else
					System.out.printf("%c ", e + ((j + 1) * n - 1 - i) % 26);
			}
			System.out.println();
		}
	}
}

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JO_1307 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1307.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char e = 'A';
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				System.out.printf("%c ", e + (i + j * n) % 26);
			}
			System.out.println();
		}
	}
}

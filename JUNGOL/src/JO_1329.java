import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JO_1329 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1329.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if (N < 0 || N > 100 || N % 2 == 0) {
			System.out.println("INPUT ERROR!");
			return;
		}
		
		for (int i = 0; i < N; i++) {
			int blank = i;
			int stars = 2 * i + 1;
			if (i > N / 2) {
				blank = N - i - 1;
				stars = 2 * (N - i) - 1; 
			}
			for (int j = 0; j < blank; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
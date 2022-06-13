import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JO_1291 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1291.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		/* INPUT */
		int s = -1;
		int e = -1;
		do {
			if (!(s == -1 && e == -1)) {
				System.out.println("INPUT ERROR!");
			}
			st = new StringTokenizer(br.readLine());
			try {
				s = Integer.parseInt(st.nextToken());
				e = Integer.parseInt(st.nextToken());
			} catch (Exception ex) {
				return;
			}
		} while (s < 2 || s > 9 || e < 2 || e > 9);
		int ad = 1;
		if (s > e)
			ad = -1;
		/* INPUT */

		/* OP */
		for (int i = 1; i < 10; i++) {
			int temp = s;
			while (temp != e + ad) {
				System.out.printf("%d * %d = %2d   ", temp, i, temp * i);
				temp += ad;
			}
			System.out.println();
		}
		/* OP */
	}
}

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JO_1341 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1341.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int sb = 1;
		if (s > e)
			sb = -1;
		
		while(s != e + sb) {
			for (int i = 0; i < 3; i++) {
				for (int j = 1; j <= 3; j++) {
					System.out.printf("%d * %d = %2d   ", s, j + i * 3, s * (j + i * 3));
				}
				System.out.println();
			}
			s += sb;
			System.out.println();
		}
	}
}

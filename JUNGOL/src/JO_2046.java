import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JO_2046 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_2046.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		switch (m) {
		case 1:
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < n; j++) {
					sb.append(i).append(" ");
				}
				sb.append("\n");
			}
			break;
		case 2:
			for (int i = 0; i < n; i++) {
				for (int j = 1; j <= n; j++) {
					sb.append(i % 2 * (n + 1) + (int) Math.pow(-1, i % 2) * j).append(" ");
				}
				sb.append("\n");
			}
			break;
		case 3:
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					sb.append(i * j).append(" ");
				}
				sb.append("\n");
			}
			break;
		}
		System.out.println(sb);
	}
}

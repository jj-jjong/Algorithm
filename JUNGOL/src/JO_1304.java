import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JO_1304 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1303.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= m; j++) {
				sb.append(i * m + j).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}

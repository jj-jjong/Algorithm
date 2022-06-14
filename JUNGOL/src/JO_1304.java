import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JO_1304 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1304.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				sb.append(i + j * n).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}

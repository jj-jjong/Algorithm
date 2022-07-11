import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JO_2811 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_2811.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] text = { "number one", "prime number", "composite number" };

		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 5; i++) {
			int n = Integer.parseInt(st.nextToken());
			int scs = 0;
			int e = n < 4 ? n : (int) Math.sqrt(n) + 1;
			for (int j = 1; j < e; j++) {
				if (n % j == 0) {
					if (++scs == 2)
						break;
				}
			}
			sb.append(text[scs]).append("\n");
		}

		System.out.println(sb);
	}
}

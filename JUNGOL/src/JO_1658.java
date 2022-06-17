import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class JO_1658 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1658.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int s = Math.min(N, M);
		int b = Math.max(N, M);
		int GCD = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= s; i++) {
			if (s % i == 0)
				list.add(i);
		}
		for (int i = list.size() - 1; i >= 0; i--) {
			if (b % list.get(i) == 0) {
				GCD = list.get(i);
				break;
			}
		}
		System.out.println(GCD);
		System.out.println(N * M / GCD);
	}
}

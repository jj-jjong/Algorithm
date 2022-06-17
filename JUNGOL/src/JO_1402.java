import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class JO_1402 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1402.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			if (N % i == 0)
				list.add(i);
		}
		try {
			System.out.println(list.get(K - 1));			
		} catch (Exception e) {
			System.out.println(0);
		}
	}
}

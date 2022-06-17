import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JO_1071 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1071.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(br.readLine());
		
		int ali = 0;
		int mul = 0;
		
		for(int i : arr) {
			if (m % i == 0)
				ali += i;
			if (i % m == 0)
				mul += i;
		}
		
		System.out.println(ali);
		System.out.println(mul);
	}
}

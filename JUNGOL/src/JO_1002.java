import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JO_1002 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1002.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int gcd = arr[0];
		int lcm = arr[0];
		
		for (int i : arr) {
			gcd = GCD(gcd, i);
			lcm = LCM(lcm, i);
		}
		
		System.out.println(gcd + " " + lcm);
	}
	
	static int GCD (int x, int y) {
		if (y == 0)
			return x;
		else
			return GCD(y, x % y);
	}
	
	static int LCM (int x, int y) {
		return x * y / GCD(x, y);
	}
}

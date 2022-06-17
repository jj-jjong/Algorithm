import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JO_1692 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1692.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String M = br.readLine();
		System.out.println(N * Integer.parseInt(M.substring(2, 3)));
		System.out.println(N * Integer.parseInt(M.substring(1, 2)));
		System.out.println(N * Integer.parseInt(M.substring(0, 1)));
		System.out.println(N * Integer.parseInt(M));
	}
}

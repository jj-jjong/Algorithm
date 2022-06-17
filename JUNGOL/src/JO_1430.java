import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JO_1430 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1430.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int ABC = 1;
		for (int i = 0; i < 3; i++) {
			ABC *= Integer.parseInt(br.readLine());
		}
		String st = Integer.toString(ABC);
		for (int i = 0; i < st.length(); i++) {
			arr[(int) (st.charAt(i)-'0')] += 1;
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}

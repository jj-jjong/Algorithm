import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class JO_1009 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_1009.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		while (true) {
			String s = br.readLine();
			try {
				if (s.equals("0"))
					continue;
			} catch (Exception e) {
				break;
			}
			String r = "";
			int sum = 0;
			boolean flag = false;
			for (int i = s.length() - 1; i >= 0; i--) {
				char temp = s.charAt(i);
				if (temp != '0') {					
					flag = true;
				}
				if (!flag) {
					continue;					
				}
				r += s.charAt(i);
				sum += s.charAt(i) - '0';
			}
			if (sb.length() != 0)
				sb.append("\n");
			sb.append(r).append(" ").append(sum);
		}
		System.out.println(sb);
	}
}
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JO_2809 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample/Sample_2809.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= Math.sqrt(N); i++) {
			if (N % i == 0)
				list.add(i);
		}
		for (int i = list.size() - 1; i >= 0; i--) {
			list.add(N / list.get(i));
		}
		
		list = list.stream().distinct().collect(Collectors.toList());
		
		for (int i : list) {
			System.out.print(i + " ");
		}
	}
}

import java.util.ArrayList;
import java.util.List;

public class FibonacciSecret {

	public static void main(String[] args) {
		String message = "The Da Vinci Code is a 2003 mystery-detective novel by Dan Brown";
		message = message.replaceAll(" ", "");
		FibonacciSecret(message);
	}

	private static void FibonacciSecret(String message) {

		int len = message.length();

		String res = "";
		
		List<Integer> fibArr = getFibonacci(len); // get fibonacci till length
		
		for (int i = 0; i < fibArr.size(); i++) {
			if (i == 0)
				res = res + message.charAt(fibArr.get(i));
			else
				res = res + "-" + message.charAt(fibArr.get(i));
			}

		System.out.println(res.toUpperCase());
	}

	private static List<Integer> getFibonacci(int len) {

		List<Integer> list = new ArrayList<Integer>();

		int sum = 0, i = 0;

		while (sum < len) {
			if (i < 2) {
				sum = i;
				list.add(i, sum);

			} else {
				sum = list.get(i - 1) + list.get(i - 2);
				if(sum<=len-1)
					list.add(i, sum);

			}
			i++;
		}
		return list;
	}

}


public class AddToDigit {

	public static void main(String[] args) {
		String number = "2875";
		int digit = 4;
		
		AddDigit(number, digit);
	}

	private static void AddDigit(String number, int digit) {
		// TODO Auto-generated method stub
		String result = "";
		for (int i = 0; i < number.length(); i++) {
			result = result+Integer.toString((Character.getNumericValue(number.charAt(i))+digit));
					}
		System.out.println(result);
	}
}

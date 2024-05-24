package atm;
public class ATM {

	public static int[] withdraw(int n) {
		int[] result = new int[3];
		// for 100
		int remainder = n % 100;
		result[0] = (remainder == 10 || remainder == 30) && n >= 100 ? 
				(n / 100 - 1) : n / 100;
		n -= result[0] * 100;
		
		// for 50
		result[1] = n % 20 == 0 ? 0 :	// no 50
			n < 50 ? 0 : 1;
		n -= result[1] * 50;
		
		// for 20
		result[2] = n / 20;

		return result;
	}
}
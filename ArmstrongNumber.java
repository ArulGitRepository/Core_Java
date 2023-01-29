package practice.tutorial.org;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int n = 123;
		int temp = n,p = 0;

		/*function to calculate
		the sum of individual digits
		*/
		while (n > 0) {

			int rem = n % 10;
			System.out.println("rem is " + rem);
			p = (p) + (rem * rem * rem);
			n = n / 10;
		
			System.out.println("p is " + p);
			System.out.println("n is " + n);
		}

		/* condition to check whether
		the value of P equals
		to user input or not. */
		System.out.println("temp is " + temp);
		if (temp == p) {
			System.out.println("Yes. It is Armstrong No.");
		}
		else {
			System.out.println(
				"No. It is not an Armstrong No.");
		}
	}

}

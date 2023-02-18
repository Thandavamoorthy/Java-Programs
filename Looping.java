package Loop;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping loop = new Looping();
		int no = 145;
		// loop.reversePrintingANumber(no);
		// loop.countOfDigits(no);
		// int sumRes = loop.sumOfDigits(no);
		int rev1Res = loop.neonNumber(no);
		int rev = loop.reverseTheNumber(no);
		int res = loop.strong(no);
		if (res == no) {
			System.out.println("The given number (" + no + ") is: Strong");
		} else {
			System.out.println("The given number (" + no + ") is: Not Strong");
		}
		if (rev == no) {
			System.out.println("The given number (" + no + ") is: Polindrome");
		} else {
			System.out.println("The given number (" + no + ") is: Not Polindrome");
		}
		if (rev1Res == no) {
			System.out.println("The given number (" + no + ") is: Neon Number");
		} else {
			System.out.println("The given number (" + no + ") is: Not Neon Number");
		}

		// System.out.println("12345 Reverse the number is: " + rev);
	}

	void reversePrintingANumber(int no) {
		int count = 0;
		while (no > 0) {
			System.out.print(no % 10);
			count = count + 1;
			no = no / 10;
		}
	}

	void countOfDigits(int no) {
		int count = 0;
		while (no > 0) {
			count = count + 1;
			no = no / 10;
		}
		System.out.println(count);
	}

	int sumOfDigits(int no) {
		int sum = 0;
		while (no > 0) {
			sum = sum + (no % 10);
			no = no / 10;
		}
		System.out.println(sum);
		return sum;
	}

	int reverseTheNumber(int no) {
		int reverse = 0;
		int rev1Res = 0;
		while (no > 0) {
			int rem = no % 10;
			reverse = (reverse * 10) + (no % 10);
			no = no / 10;
		}
		return reverse;
	}

	int find_power(int base, int power) {
		int result = 1;
		while (power > 0) {
			result = result * base;
			power = power - 1;
		}
		return result;
	}

	int neonNumber(int no) {
		int rev1Res = 0;
		while (no > 0) {
			int rem = no % 10;
			int rev1 = find_power(rem, 3);
			//System.out.println("Result is: " + rev1);
			rev1Res = rev1Res + rev1;
			no = no / 10;
		}
		//System.out.println("The sum of Result is: " + rev1Res);
		return rev1Res;
	}
	
	int strong(int no) {
		int sum = 0;
		while(no>0) {
			int no3 = no % 10;
			int fact = 1;
			while(no3 > 0) {
				fact = fact * no3;
				no3=no3-1;
			}
			sum = sum + fact;
			no = no / 10;
		}
		return sum;
	}
	
	
}

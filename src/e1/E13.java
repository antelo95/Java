package e1;

public class E13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 118;
		System.out.println(devSumDigit(n));
	}
	static int devSumDigit(int num) {
		int a = 0;
		while(num > 0) {
			int mod = num %10;
			num = num /10;
			a += mod;
		}
		return a;
	}
}

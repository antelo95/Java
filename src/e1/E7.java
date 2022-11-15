package e1;

public class E7 {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(devFact(n));
	}
	static int devFact(int num) {
		int a= 1;
		for (int i = 1; i <= num;i++) {
			a *= i;
		}
		return a;
	}
}

package e1;

public class E6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 220;
		int n1 = 284;
		int s = sumDiv(n);
		int s1 = sumDiv(n1);
		System.out.printf("La suma de los divisores de %d es: %d\n", n, s);
		System.out.printf("La suma de los divisores de %d es: %d\n", n1, s1);
		System.out.println(amigos(n, n1, s, s1));
	}
	static int sumDiv (int num) {
		int a = 0;
		for (int i = 1; i< num; i++) {
			if (num % i == 0) {
				a+=i;
			}
		}
		return a;
	}
	static boolean amigos(int n, int n1, int s, int s1) {
		if (n == s1 && n1 == s) {
			return true;
		}else
			return false;
	}

}

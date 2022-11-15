package e1;

public class E14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int n1 = 11;
		prim(n);
		prim(n1);
		boolean b = checkPrim(n);
		boolean b1 = checkPrim(n1);
		
		if ((b == true && b1 == true) && (n1 - n == 2)) {
			System.out.printf("%d y %d son primos gemelos", n , n1);			
		} else
			System.out.printf("%d y %d no son primos gemelos", n , n1);
	}
	static void prim(int num) {
		int a = 0;
		for (int i = 2; i< num;i++) {
			if (num % i == 0) {
				a++;
			}
		}
		if (a!= 0)
			System.out.printf("%d no es un nº primo.\n", num);
		else
			System.out.printf("%d es un nº primo.\n", num);
	}
	static boolean checkPrim(int num) {
		int a = 0;
		for (int i = 2; i< num;i++) {
			if (num % i == 0) {
				a++;
			}
		}
		if (a!= 0)
			return false;
		else
			return true;
	}
}

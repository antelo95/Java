package e1;

public class E12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		System.out.println(checkPrim(n));
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

package e1;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		int n1 =9;
		
		System.out.printf("El nº mayor es %d.",devMayor(n, n1));
		
	}
	static int devMayor(int num, int num1) {
		if(num > num1)
			return num;
		else
			return num1;
	}
}

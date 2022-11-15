package e1;

public class E16_recursividad_ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long inicio = System.currentTimeMillis();
		int n = 30;
		System.out.println(fibo(n));
		long fin = System.currentTimeMillis();
		double tiempo = (double) ((fin - inicio)/1000);
		System.out.printf("%fs.", tiempo);
}
	static long fibo(int num) {
		if (num <2)
			return num;
		else {
			System.out.println(num-1);
			System.out.println(num-2);
			return fibo(num -1) + fibo(num -2);
		}
	}
}

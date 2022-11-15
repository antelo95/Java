package e1;

public class E8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c =30;
		double f =gradosCF(c);
		double k =  gradosCK(c);
		System.out.printf("%.0fºC son %.2fºF y %.2fºK.", c, f,k);
	}
	static double gradosCK(double c) {
		double k = c + 272.15;
		return k;
	}
	static double gradosCF(double c) {
		double f = (c * 1.8) +32;
		return f;
	}
	

}

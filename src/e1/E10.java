package e1;

import java.util.Random;

public class E10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int n1 = 19;
		System.out.println(devRNum(n, n1));
	}
	static int devRNum(int n, int n1) {
		Random rdn = new Random();
		int ranNum = rdn.nextInt((n1+1) - n) + n;
		return ranNum;
	}
}

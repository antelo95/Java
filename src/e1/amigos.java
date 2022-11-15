package e1;

public class amigos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 2620;
		int n2 = 2924;
		int an1 = 0;
		int an2 = 0;
		for (int i = 1; i <= n1/2;i++) {
			if (n1 % i == 0) {
				an1 += i;
			}
		}
		
		for (int j = 1; j <= n2/2; j++) {
			if (n2 % j == 0) {
				an2 += j;
			}
		}
		
		System.out.println(an1);
		System.out.println(an2);
		
		if(n1 == an2 && n2 == an1) {
			System.out.println("Son amigos");
		} else {
			System.out.println("No");
		}
	}

}

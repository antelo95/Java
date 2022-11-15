package e1;

public class Primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 23;
		//int a = 0;
		for (int j= 2; j<=1000;j++) {
			int a = 0;
			for (int i =2;i < j; i++) {
				if(j % i == 0) {
					a++;
				} 
			}
			if (a == 0) {
				System.out.printf("%d es primo\n",j);
			} 
		}
		
	}
		
}



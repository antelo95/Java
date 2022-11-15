package e1;

public class E16_memo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 90;
		long [] arr= fibo(n);
		for (int i = 0; i<n;i++) {
			System.out.printf("%d ---> %d\n", i, arr[i]);
		}
	}

	static long[] fibo(int n) {
		// TODO Auto-generated method stub
		
		long[] arr1= new long[n+1];
		arr1[0]= 0;
		arr1[1]=1;
		for(int i = 2; i <= n;i++) {
			arr1[i] += arr1[i - 1] + arr1[i - 2];
		}
		return arr1;
	}

}

package e1;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [] arr = new int[8];
		for (int j =0; j<8;j++) {
			arr[j] = input.nextInt();		
		}
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		
	}
}

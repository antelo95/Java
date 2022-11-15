package e1;

public class Exam4 {
	public static void main(String[] args) {
		for (int i =1; i<=10; i++) {
			double n = 3 + (Math.sqrt(5));
			double num = Math.pow(n, i);
			int num1 = (int)num;
			int mod = 0;
			System.out.println(" \n"+i +"		"+num1);
		
			if (num1 >99) {
				String cien = Integer.toString(num1);
				for (int j = 0; j<3;j++) {
					System.out.print(cien.charAt(cien.length()-3 +j));
				}
				
			} else if (num1 > 9){
				System.out.print("0");
				mod = num1 %100;
				String cien = Integer.toString(mod);
				System.out.print(cien);
			} else {
				System.out.print("00");
				mod = num1 %10;
				String cien = Integer.toString(mod);
				System.out.print(cien);
			}
		}
		
	}
}

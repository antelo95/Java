package e1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m = "  ";
		String m1 = ""; 
		int i = 0;
		int j;
		int a = 0;
		while (i < m.length()) {
			if (m.charAt(i) == ' ') {
				i++;
			} //else if (m.charAt(i) == 'é') {
				//m1 += 'e';
				//i++;
			//} 
			else if(m.charAt(i) >= 'á' && m.charAt(i) <= 'ú') {
				m1 += ((int)m.charAt(i));
				i++;
			}
			
			else {
				m1 += m.toLowerCase().charAt(i);
				i++;
			} 
		}
		
		for (j = 0; j < m1.length(); j++) {
			if(m1.charAt(j) != m1.charAt(m1.length() - 1- j)) {
				a++;
			}
		}
		
		System.out.println(m1);
		if (a > 0) {
			System.out.println("No");
		} else {
			System.out.println("si");
		}
	}

}

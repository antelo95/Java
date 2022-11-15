package e1;

public class E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		char c1 = 'z';
		characters(c, c1);
	}
	static void characters(char c, char c1) {
		while (c <= c1) {
			if (c == c1) {
				System.out.printf("%c.",c);
				break;
			} else {
				System.out.printf("%c, ",c);
				c++;
			}
	
		}
	}

}

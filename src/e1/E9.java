package e1;

import java.util.Random;

public class E9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(devChar());
	}
	static char devChar() {
		int i = 1;
		for (char a = 'a'; a<='z';a++) {
			System.out.print(a);
			i++;
		}
		System.out.println(i);
		Random c = new Random();
		char character = (char)(c.nextInt(i) + 'a');
		return character;
	}
}

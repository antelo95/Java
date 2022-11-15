package e1;

public class E15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hOldI3424fffsa";
		System.out.printf("Hay %d minúsculas.", returnLower(str));
	}
	static int returnLower(String str) {
		int a = 0;
		for(int i = 0;i <str.length();i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				a++;
			}
		}
		return a;
	}

}

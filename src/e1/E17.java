package e1;

public class E17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "holdsa4552fs";
		if(str.length() % 2 != 0) {
			System.out.println(centralChar(str));
		} else
			System.out.println(centralSubStr(str));
	}

	 static CharSequence centralSubStr(String str) {
		// TODO Auto-generated method stub
		return str.subSequence((str.length()/2)-1, (str.length()/2)+1);
	}

	static char centralChar(String str) {
		// TODO Auto-generated method stub
		return str.charAt(str.length()/2);
	}

}

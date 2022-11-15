package e1;

public class E18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String passwd = "19esosdeAntelo";
		System.out.println(checkPasswd(passwd));
	}

	static boolean checkPasswd(String passwd) {
		// TODO Auto-generated method stub
		System.out.println(passwd.length());
		int ad = 0;
		int ac = 0;
		for (int i = 0; i < passwd.length();i++) {
			if (passwd.charAt(i)>='0' && passwd.charAt(i)<='9') {
				ad++;
			}
			if(!((passwd.charAt(i)>='a' && passwd.charAt(i)<='z') || (passwd.charAt(i)>='A' && passwd.charAt(i)<='Z')  || (passwd.charAt(i)>='0' && passwd.charAt(i)<='9'))) {
				ac++;
			}
		}
		System.out.println(ad);
		System.out.println(ac);
		if ((passwd.length()>=10) && (ad>=2) && (ac == 0))
			return true;
		else
			return false;
	}

}

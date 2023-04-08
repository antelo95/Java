package ex1_1;

import java.util.List;

public class App {
	public static void main(String[] args) {
		String [] nifs = {"80137039T","30198235S" , "15835050X", "30533829H", 
				"46548712R", "30499569M", "30437328W", 
				"30519074Y", "46533875E", "5195471R", "04587668L", "51374874G", "30535897Q"};
		
		List<String> correctos = CompruebaNif.getCorrectos(nifs);
		for (String string : correctos) {
			System.out.println(string);
		}
	}
}

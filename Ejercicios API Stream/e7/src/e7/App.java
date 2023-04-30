package e7;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionJugadores g = new GestionJugadores();
		for (Jugador j : g.getJugadores()) {
			System.out.println(j.toString());
		}
		//g.nombresJugadoresOrdenASC();
//		g.jugadoresNombreContieneLetra('4');
//		g.mediaPesos();
		g.alturaSuperiorMedia();
	}

}

package Musiciens;

public class MusicienFactory {
	
	//créer un musicien avec son nom en fonction de l'instrument passé en paramètre, si l'instrument n'existe pas renvoie null
	public static Musicien Build(String instrument, String nom) {
		Musicien musicien = null;
		switch(instrument) {
			case "Piano":
				musicien = new MusicienPiano(nom);
			break;
			case "Violin":
				musicien = new MusicienViolon(nom);
			break;
			case "Trumpet":
				musicien = new MusicienTrompette(nom);
			break;
		}
		return musicien;
	}
}

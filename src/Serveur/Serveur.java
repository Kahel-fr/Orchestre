//simule le serveur, singleton
public class Serveur {
	//instance unique du serveur
	static private Serveur instance;
	
	//constructeur privé pour empêcher cette classe d'être instancié à l'extérieur de la classe
	private Serveur() {
		
	}
	
	//retourne l'instance unique, la créer si elle n'existe pas encore
	public Serveur getInstance() {
		if(instance == null)
			instance = new Serveur();
		return instance;
	}
	
}

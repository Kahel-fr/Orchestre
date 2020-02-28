package Serveur;
//représente une partition de musique
public class Partition {
	
	String nom;
	char Tonalite;
	
	public Partition(String nom, char tonalite) {
		super();
		this.nom = nom;
		Tonalite = tonalite;
	}
	
	public String getNom() {
		return nom;
	}
	
	public char getTonalite() {
		return Tonalite;
	}
}

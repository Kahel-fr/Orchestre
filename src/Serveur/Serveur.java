package Serveur;
import java.util.ArrayList;

import Musiciens.Musicien;

//simule le serveur, singleton
public class Serveur {
	//instance unique du serveur
	static private Serveur instance;
	
	//liste des observers à notifier en cas d'ajout de partition
	ArrayList<IObserverPartition> observers;
	
	//constructeur privé pour empêcher cette classe d'être instancié à l'extérieur de la classe
	private Serveur() {
		observers = new ArrayList<IObserverPartition>();
	}
	
	//retourne l'instance unique, la créer si elle n'existe pas encore
	public Serveur getInstance() {
		if(instance == null)
			instance = new Serveur();
		return instance;
	}
	
	//ajoute une partition
	void AjouterPartition(Partition partition) {
		//tout les observers sont notifiés
		for(IObserverPartition observer : observers)
			observer.Notify(partition);
	}
}

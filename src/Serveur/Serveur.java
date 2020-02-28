package Serveur;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

import Musiciens.Musicien;
import Musiciens.MusicienFactory;

//simule le serveur, singleton
public class Serveur {
	//instance unique du serveur
	static private Serveur instance;
	
	//liste des observers à notifier en cas d'ajout de partition
	ArrayList<IObserverPartition> observers;
	
	//liste des musiciens
	ArrayList<Musicien> musiciens;
	
	//liste des partitions
	ArrayList<Partition> partitions;
	
	//constructeur privé pour empêcher cette classe d'être instancié à l'extérieur de la classe
	private Serveur() {
		observers = new ArrayList<IObserverPartition>();
		musiciens = new ArrayList<Musicien>();
		partitions = new ArrayList<Partition>();
	}
	
	//retourne l'instance unique, la créer si elle n'existe pas encore
	public static Serveur getInstance() {
		if(instance == null)
			instance = new Serveur();
		return instance;
	}
	
	//ajoute une partition
	public void AjouterPartition(Partition partition) {
		//sauvegarde la partition
		partitions.add(partition);
		//tout les observers sont notifiés
		for(IObserverPartition observer : observers)
			observer.Notify(partition);
	}
	
	//ajoute un musicien
	public void AjouterMusicien(String instrument, String nom) {
		Musicien musicien = MusicienFactory.Build(instrument, nom);
		if(musicien != null) {
			musiciens.add(musicien);
			observers.add(musicien);
		}
	}
	
	//enlève un musicien
	public void EnleverMusicien(String nom) {
		musiciens.removeIf(new Predicate<Musicien>() {
			@Override
			public boolean test(Musicien musicien) {
				return musicien.getNom() == nom;
			}
		});
	}
	
	//retourne le nombre de musiciens
	public int getNombreMusiciens() {
		return musiciens.size();
	}
	
	//retourne le nombre de partitions
	public int getNombrePartitions() {
		return partitions.size();
	}
	
	
}

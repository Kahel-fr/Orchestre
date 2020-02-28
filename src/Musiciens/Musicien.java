package Musiciens;

import java.util.ArrayList;

import Serveur.IObserverPartition;
import Serveur.Partition;

//représente un musicien
public class Musicien implements IObserverPartition {
	
	//nom du musicien
	String nom;
	
	//liste des partitions
	ArrayList<Partition> partitions;
	
	Musicien(String nom){
		this.nom = nom;
		partitions = new ArrayList<Partition>();
	}

	//sauvegarde la partition lorsque celle-ci est ajouté par le serveur
	@Override
	public void Notify(Partition partition) {
		partitions.add(partition);
		System.out.println(nom + " a été notifié de l'ajout de la partition "+ partition.getNom());
	}
	
	
}

package Musiciens;

import Serveur.Partition;
import Serveur.Serveur;

public class Main {
	public static void main(String[] args) {
		Serveur serveur = Serveur.getInstance();
		serveur.AjouterMusicien("Piano", "Bach");
		serveur.AjouterMusicien("Violin", "Vivaldi");
		serveur.AjouterMusicien("Trumpet", "Bob");
		
		serveur.AjouterPartition(new Partition("Lettre à Elise", 'B'));
		serveur.AjouterPartition(new Partition("L'hiver", 'D'));
	}
}

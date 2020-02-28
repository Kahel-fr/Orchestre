import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Serveur.Partition;
import Serveur.Serveur;

class TestServeur {

	@Test
	void testAjoutMusicien() {
		Serveur.getInstance().AjouterMusicien("Trumpet", "Bob");
		assertEquals(1, Serveur.getInstance().getNombreMusiciens());
	}

	@Test
	void testEnleverMusicien() {
		Serveur.getInstance().AjouterMusicien("Violin", "Vivaldi");
		Serveur.getInstance().EnleverMusicien("Vivaldi");
		assertEquals(0, Serveur.getInstance().getNombreMusiciens());
	}
	
	@Test
	void testAjoueterPartitionServeur() {
		Serveur.getInstance().AjouterPartition(new Partition("Lettre à Elise", 'A'));
		assertEquals(1, Serveur.getInstance().getNombrePartitions());
	}
	
	@Test
	void testAjoueterPartitionMusicien() {
		Serveur.getInstance().AjouterMusicien("Trumpet", "Bob");
		Serveur.getInstance().AjouterPartition(new Partition("Lettre à Elise", 'A'));
		assertEquals(1, Serveur.getInstance().musiciens.get(0).partitions.size());
	}
	
}

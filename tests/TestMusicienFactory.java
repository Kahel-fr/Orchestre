import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Musiciens.MusicienFactory;
import Musiciens.MusicienPiano;
import Musiciens.MusicienViolon;

class TestMusicienFactory {

	@Test
	void testBuildTypePiano() {
		assertEquals(MusicienPiano.class, MusicienFactory.Build("Piano", "Bach").getClass());
	}
	
	@Test
	void testBuildTypeViolon() {
		assertEquals(MusicienViolon.class, MusicienFactory.Build("Violin", "Vivaldi").getClass());
	}
	
	@Test
	void testBuildNom() {
		assertEquals("Bach", MusicienFactory.Build("Piano", "Bach").getNom());
	}
	
	@Test
	void testBuildInstrumentInconnu() {
		assertNull(MusicienFactory.Build("Maracass", "Bob"));
	}

}

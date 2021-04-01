package ceasers.cypher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCipherTest {

	private CeasarsCipher ceasarsCipher = new CeasarsCipher();
	
	@Test
	void testCipheredMessageWithOffsetOf12() {
		assertEquals("Zai SdW kag Va[`Y faVSk", ceasarsCipher.cipher("how are you doing today", 12));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", ceasarsCipher.cipher("", 12));
	}
	
	//Purposefully Failing test
	@Test
	void testCipheredMessageWithOffsetOf11() {
		assertEquals("Zai SdW kag Va[`Y faVSk", ceasarsCipher.cipher("how are you doing today", 11));
	}
	

}

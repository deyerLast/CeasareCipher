package ceasers.cypher;

public class Main {

	public static void main(String[] args) {
		
		String message = "how are you doing today";
		int offset = 12;
		
		CeasarsCipher caesarsCipher = new CeasarsCipher();
		caesarsCipher.cipher(message, offset);
		
		System.out.println("Message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered message: " + caesarsCipher.cipher(message, offset));
	}
}

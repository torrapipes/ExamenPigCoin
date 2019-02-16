package transaction;

import java.security.PublicKey;

public class Transaction {

	private String hash = null;
	private String prev_hash = null;
	private PublicKey pKey_sender = null;
	private PublicKey pKey_recipient = null;
	private double pigcoins = 0d;
	private String message = null;
	
	// Constructores
	
	public Transaction() {
		
	}

	public Transaction(String hash, String prev_hash, PublicKey pKey_sender, PublicKey pKey_recipient, double pigcoins,
			String message) {

		this.hash = hash;
		this.prev_hash = prev_hash;
		this.pKey_sender = pKey_sender;
		this.pKey_recipient = pKey_recipient;
		this.pigcoins = pigcoins;
		this.message = message;
		
	}

	
	// Métodos
	
	@Override
	public String toString() {
		
		return "hash = " + hash + "\n prev_hash = " + prev_hash + "\n pKey_sender = " + pKey_sender.hashCode()
				+ "\n pKey_recipient = " + pKey_recipient.hashCode() + "\n pigcoins = " + pigcoins + "\n message = " + message;
		
	}
	
	
	
	
	
}
	
	
	

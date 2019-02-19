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

	// Getters
	
	public String getHash() {
		
		return this.hash;
		
	}
	
	
	public String getPrevHash() {
		
		return this.prev_hash;
		
	}
	
	
	public PublicKey getPkeySender() {
		
		return this.pKey_sender;
		
	}
	
	
	public PublicKey getPkeyRecipient() {
		
		return this.pKey_recipient;
		
	}
	
	
	public double getPigcoins() {
		
		return this.pigcoins;
		
	}
	
	public String getMessage() {
		
		return this.message;
		
	}
	
	
	// Setters
	
	public void setHash(String hash) {
		
		this.hash = hash;
		
	}
	
	
	public void setMessage(String message) {
		
		this.message = message;
		
	}
	
	
	public void setPigcoins(double pigcoins) {
		
		this.pigcoins = pigcoins;
		
	}
	
	
	public void setPrevHash(String prev) {
		
		this.prev_hash = prev;
		
	}
	
	
	// Métodos
	
	@Override
	public String toString() {
		
		return "hash = " + getHash() + "\n prev_hash = " + getPrevHash() + "\n pKey_sender = " + getPkeySender().hashCode()
				+ "\n pKey_recipient = " + getPkeyRecipient().hashCode() + "\n pigcoins = " + getPigcoins() + "\n message = " + getMessage();
		
	}
	
	
	
	
	
}
	
	
	

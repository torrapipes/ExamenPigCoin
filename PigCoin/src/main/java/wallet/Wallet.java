package wallet;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

import genSig.GenSig;

public class Wallet {
	
	// Atributos
	
	private PublicKey pKey = null;
    private PrivateKey sKey = null;
    private double total_input = 0d;
    private double total_output = 0d;
    private double balance = 0d;
    
    
    // Constructor
    
    public Wallet() {
    	
    }
    
    
    // Getters
    
    public PublicKey getAddress() {
    	
    	return this.pKey;
    	
    }
    
    
    public double getBalance() {
    	
    	return this.balance;
    	
    }
    
    
    public PrivateKey getSK() {
    	
    	return this.sKey;
    	
    }
    
    
    public double getTotalInput() {
    	
    	return this.total_input;
    	
    }
    
    
    public double getTotalOutput() {
    	
    	return this.total_output;
    	
    }
    
    
    // Setters
    
    public void setAddress(PublicKey pKey) {
    	
    	this.pKey = pKey;
    	
    }
    
    
    public void setSK(PrivateKey sKey) {
    	
    	this.sKey = sKey;
    	
    }
    
 
    public void setTotalInput(double input) {
    	
    	this.total_input = input;
    	
    }
    
    
    public void setTotalOutput(double output) {
    	
    	this.total_output = output;
    	
    }
    
    
    public void setBalance(double balance) {
    	
    	this.balance = balance;
    	
    }
    
    
    // Métodos

    public void generateKeyPair() {
    	
    	setAddress(GenSig.generateKeyPair().getPublic());
    	setSK(GenSig.generateKeyPair().getPrivate());
    	
    }


	@Override
	public String toString() {
		
		return "Wallet = " + getAddress().hashCode() + "\n total_input = " + getTotalInput() + "\n total_output = " + getTotalOutput() + "\n balance = "
				+ getBalance();
		
	}
    
		
		
	}
    
   

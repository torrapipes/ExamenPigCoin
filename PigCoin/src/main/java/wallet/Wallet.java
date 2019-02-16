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
    
    
    // Métodos
    
    public void setAddress(PublicKey pKey) {
    	
    	this.pKey = pKey;
    	
    }
    
    
    public PublicKey getAddress() {
    	
    	return this.pKey;
    	
    }
    
    
    public void setSK(PrivateKey sKey) {
    	
    	this.sKey = sKey;
    	
    }
    
    
    public PrivateKey getSK() {
    	
    	return this.sKey = sKey;
    	
    }
    
    
    public void generateKeyPair() {
    	
    	setAddress(GenSig.generateKeyPair().getPublic());
    	setSK(GenSig.generateKeyPair().getPrivate());
    	
    }
    
    
    public void setTotalInput(double input) {
    	
    	this.total_input = input;
    	
    }
    
    
    public double getTotalInput() {
    	
    	return this.total_input;
    	
    }
    
    
    public void setTotalOutput(double output) {
    	
    	this.total_output = output;
    	
    }
    
    
    public double getTotalOutput() {
    	
    	return this.total_output;
    	
    }
    
    
    public void setBalance(double balance) {
    	
    	this.balance = balance;
    	
    }
    
    
    public double getBalance() {
    	
    	return this.balance;
    	
    }


	@Override
	public String toString() {
		
		return "Wallet = " + getAddress().hashCode() + "\n total_input = " + getTotalInput() + "\n total_output = " + getTotalOutput() + "\n balance = "
				+ getBalance();
		
	}
    
		
		
	}
    
   

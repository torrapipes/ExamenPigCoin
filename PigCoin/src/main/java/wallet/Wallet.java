package wallet;

import java.security.PrivateKey;
import java.security.PublicKey;

public class Wallet {
	
	// Atributos
	
	private PublicKey pKey = null;
    private PrivateKey sKey = null;
    private String total_input = null;
    private String total_output = null;
    private String balance = null;
    
    
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
    
    
    
}

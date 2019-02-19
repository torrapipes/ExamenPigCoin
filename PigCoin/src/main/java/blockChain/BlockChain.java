package blockChain;

import java.util.List;
import java.util.ArrayList;

import transaction.Transaction;

public class BlockChain {

	
	private List<Transaction> blockChain = new ArrayList<Transaction>();
	
	// Constructor
	
	public BlockChain() {
		
	}
	
	// Getters
	
	public List<Transaction> getBlockChain(){
		
		return this.blockChain;
		
	}
	
	// Métodos 
	
	public void addOrigin(Transaction transaction) {
		
		this.getBlockChain().add(transaction);
		
	}
	
	
}

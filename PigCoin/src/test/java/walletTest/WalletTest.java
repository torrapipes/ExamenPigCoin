package walletTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.security.KeyPair;
import java.security.PublicKey;

import org.junit.Before;
import org.junit.Test;

import blockChain.BlockChain;
import genSig.GenSig;
import transaction.Transaction;
import wallet.Wallet;

public class WalletTest {

	private Wallet wallet = null;
	
	@Before
	public void init() {
		
		wallet = new Wallet();
		wallet.generateKeyPair();
		
		
		
	}
	
	
	@Test
	public void createWalletTest() {
		
		assertNotNull(wallet);
		
	}
	
	// GettersTest
	
	@Test
	public void getInputTest() {
		
		double total_input = 5.5;
		wallet.setTotalInput(total_input);
		assertEquals(total_input,wallet.getTotalInput(), 0.0);
		
	}
	
	
	@Test
	public void getOutputTest() {
		
		double total_output = 2.2;
		wallet.setTotalOutput(total_output);
		assertEquals(total_output, wallet.getTotalOutput(), 0.0);
		
	}
	
	
	@Test
	public void getBalanceTest() {
		
		double balance = 4.4;
		wallet.setBalance(balance);
		assertEquals(balance, wallet.getBalance(), 0.0);
		
	}
	
	// SettersTest
	
	@Test
	public void setAddressTest() {
		
		KeyPair pair = GenSig.generateKeyPair();
		wallet.setAddress(pair.getPublic());
		assertNotNull(wallet.getAddress());
		
	}
	
	
	@Test
	public void setSKTest() {
		
		KeyPair pair = GenSig.generateKeyPair();
		wallet.setSK(pair.getPrivate());
		assertNotNull(wallet.getSK());
		
	}
	
	
	// Test de los métodos
	
	@Test
	public void generateKeyPairTest() {
		
		wallet.generateKeyPair();
		KeyPair pair = GenSig.generateKeyPair();
		assertNotNull(wallet.getAddress());
		assertNotNull(wallet.getSK());
		
	}
	
	@Test
	public void loadCoinsTest() {
		
		Wallet wallet_destino = new Wallet();
		wallet_destino.generateKeyPair();
		
		Transaction trx = new Transaction("hash_1", "0", wallet.getAddress(), wallet_destino.getAddress(), 20, "testing... 1, 2, 3...");
		
		BlockChain bChain = new BlockChain();
		
		bChain.getBlockChain().add(trx);
        
        wallet_destino.loadCoins(bChain);
        wallet.loadCoins(bChain);
          
        assertEquals(20, wallet_destino.getTotalInput(), 0.0);
		
        assertEquals(0, wallet.getBalance(), 0.0);
	}
	
	
	@Test
	public void loadInputTransactions() {
		
		BlockChain bChain = new BlockChain();
		
		Wallet wallet_1 = new Wallet();
		
		Transaction trxIn = new Transaction("hash_1", "0", wallet_1.getAddress(), wallet.getAddress(), 20, "testing... 1, 2, 3...");
		Transaction trxOut = new Transaction("hash_1", "0", wallet.getAddress(), wallet_1.getAddress(), 20, "testing... 1, 2, 3...");
		
		bChain.getBlockChain().add(trxIn);
		bChain.getBlockChain().add(trxOut);
		
		wallet.loadInputTransactions(bChain);
		wallet.loadOutputTransactions(bChain);
		
		assertEquals(trxIn, wallet.getInputTransactions().get(0));
		assertEquals(trxOut, wallet.getOutputTransactions().get(0));
		
	}
	
	
	
	
}

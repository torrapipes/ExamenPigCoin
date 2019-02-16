package walletTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.security.KeyPair;
import java.security.PublicKey;

import org.junit.Before;
import org.junit.Test;

import genSig.GenSig;
import wallet.Wallet;

public class WalletTest {

	private Wallet wallet = null;
	
	@Before
	public void init() {
		
		wallet = new Wallet();
		
		
	}
	
	
	@Test
	public void createWalletTest() {
		
		assertNotNull(wallet);
		
	}
	
	
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
	
	
	@Test
	public void generateKeyPairTest() {
		
		wallet.generateKeyPair();
		KeyPair pair = GenSig.generateKeyPair();
		assertNotNull(wallet.getAddress());
		assertNotNull(wallet.getSK());
		
	}
	
	
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
	
}

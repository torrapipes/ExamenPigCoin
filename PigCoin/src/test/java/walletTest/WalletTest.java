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
		wallet.setAddress(pair.getPrivate()());
		assertNotNull(wallet.getSK());
		
	}
}

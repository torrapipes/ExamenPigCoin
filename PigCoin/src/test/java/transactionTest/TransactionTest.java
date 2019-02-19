package transactionTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import transaction.Transaction;
import wallet.Wallet;

public class TransactionTest {

	private Transaction trx = null;
	
	@Before
	public void init() {
		
		trx = new Transaction();
		
	}
	
	
	@Test
	public void getHashTest() {
		
		String hash = "1";
		trx.setHash(hash);
		assertEquals(hash, trx.getHash());
		
	}
	
	
	@Test
	public void getMessageTest() {
		
		String message = "hey";
		trx.setMessage(message);
		assertEquals(message, trx.getMessage());
		
	}
	
	
	@Test
	public void getPigcoinsTest() {
		
		double pigcoins = 2.4;
		trx.setPigcoins(pigcoins);
		assertEquals(pigcoins, trx.getPigcoins(), 0.0);
		
	}
	
	
	@Test
	public void getPrevHashTest() {
		
		String prev = "hey again";
		trx.setPrevHash(prev);
		assertEquals(prev, trx.getPrevHash());
		
	}
	
	
	/*@Test
	public void getPkeyRecipientTest() {
		
		Wallet wallet_2 = new Wallet();
		Wallet wallet_1 = new Wallet();
		trx = new Transaction("hash_1", "0", wallet_1.getAddress(), wallet_2.getAddress(), 20, "a flying pig!");
		assertNotNull(trx.getPkeyRecipient());
		
	}
	
	
	@Test
	public void getPkeySenderTest() {
		
		Wallet wallet_1 = new Wallet();
		Wallet wallet_2 = new Wallet();
		trx = new Transaction("hash_1", "0", wallet_1.getAddress(), wallet_2.getAddress(), 20, "a flying pig!");
		assertNotNull(trx.getPkeySender());
		
	}*/
	
}

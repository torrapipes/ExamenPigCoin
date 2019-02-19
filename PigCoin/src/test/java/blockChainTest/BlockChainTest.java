package blockChainTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import blockChain.BlockChain;
import transaction.Transaction;

public class BlockChainTest {

	
	@Test
	public void addOriginTest() {
		
		BlockChain b = new BlockChain();
		Transaction trx = new Transaction();
		
		b.addOrigin(trx);
		
		for (Transaction tra : b.getBlockChain()) {
			
			assertEquals(trx, tra);
			
		}
		
	}
	
}

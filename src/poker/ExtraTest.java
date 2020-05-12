package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExtraTest {

	@Test
	public void testAnalyzeHand() {
		String s[]= {"AC","4C","3C","5C","2C"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("straight-flush"));
	}

}

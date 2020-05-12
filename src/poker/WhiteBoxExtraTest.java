package poker;

import static org.junit.Assert.*;

import org.junit.Test;

import poker.PokerHandAnalyzer.Score;

public class WhiteBoxExtraTest {

	@Test
	public void testAnalyzeHand1() {
		String s[]= {"2C"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: wrong number of cards"));
	}
	@Test
	public void testAnalyzeHand2() {
		String s[]= {"AC","2C","3C","4C","5Q"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("straight"));
	}
	@Test
	public void testAnalyzeHand3() {
		String s[]= {"2C","3C","4C","5C","7C"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("flush"));
	}
	@Test
	public void testPokerHandAnalyzer() {
		PokerHandAnalyzer p=new PokerHandAnalyzer();
		assertNotNull(p);
	}
	@Test
	public void testScore() {
		//Score sc=new Score("straight", 5,null);
		String s[]= null;
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("null empty hand"));
		//assertNull(sc.hand);
	}
	
}

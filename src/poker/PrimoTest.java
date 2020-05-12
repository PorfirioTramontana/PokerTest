package poker;

import static org.junit.Assert.*;

import org.junit.Test;

import poker.PokerHandAnalyzer.Score;

public class PrimoTest {

	@Test
	public void testAnalyzeHand() {
		String s[]= {"2C","2F","2Q","KF","2P"};
		assertTrue(PokerHandAnalyzer.analyzeHand(s).toString().contains("four-of-a-kind"));
	}

}

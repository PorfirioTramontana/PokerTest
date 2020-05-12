package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecisionTable1 {
/*
Test	Numero	Seme	Numero	Seme	Numero	Seme	Numero	Seme	Numero	Seme	Risultato atteso
1	2	C	2	F	2	P	3	C	3	F	full-house
2	2	C	3	C	4	C	5	C	6	C	flush
3	2	C	3	F	4	P	5	Q	6	C	straight
4	2	C	2	P	2	F	2	Q	3	C	four-of-a-kind
5	2	C	2	P	2	F	3	Q	4	F	three-of-a-kind
6	2	C	2	F	3	C	3	F	4	Q	two-pair
7	2	C	2	F	3	C	4	F	5	Q	one-pair
8	2	C	3	F	4	Q	5	P	7	C	high card 
9	0	C	2	F	2	P	3	C	3	F	invalid hand: non existing face
10	2	X	2	F	2	P	3	C	3	F	invalid hand: non-existing suit
11	2	C	2	C	2	C	2	C	2	C	invalid hand: duplicates
 */
	
	@Test
	public void testAnalyzeHand1() {
		String s[]= {"2C","2F","2P","3C","3F"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("full-house"));
	}
	
	@Test
	public void testAnalyzeHand2() {
		String s[]= {"2C","3C","4C","5C","6C"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("straight-flush"));
	}
	@Test
	public void testAnalyzeHand3() {
		String s[]= {"2C","3F","4P","5Q","6C"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("straight"));
	}
	@Test
	public void testAnalyzeHand4() {
		String s[]= {"2C","2F","2P","2Q","3C"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("four-of-a-kind"));
	}
	@Test
	public void testAnalyzeHand5() {
		String s[]= {"2C","2F","2P","3Q","4F"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("three-of-a-kind"));
	}
	@Test
	public void testAnalyzeHand6() {
		String s[]= {"2C","2F","3C","3F","4C"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("two-pair"));
	}
	@Test
	public void testAnalyzeHand7() {
		String s[]= {"2C","2F","3C","4F","5C"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("one-pair"));
	}
	@Test
	public void testAnalyzeHand8() {
		String s[]= {"2C","3F","4C","5F","7C"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("high-card"));
	}
	@Test
	public void testAnalyzeHand9() {
		String s[]= {"02C","3F","4C","5F","7C"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: non existing face"));
	}
	@Test
	public void testAnalyzeHand10() {
		String s[]= {"2X","3F","4C","5F","7C"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: non-existing suit"));
	}
	@Test
	public void testAnalyzeHand11() {
		String s[]= {"2C","2C","2C","2C","2C"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: duplicates"));
	}
}

package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoperturaMinimaClassiEquivalenzaValoriLimite {
/*
Copertura minima delle classi di equivalenza e valori limite										
	Carta1		Carta2		Carta3		Carta4		Carta5	
Test	Numero	Seme	Numero	Seme	Numero	Seme	Numero	Seme	Numero	Seme
1	2	C	2	C	2	C	2	C	2	C
2	3	F	3	F	3	F	3	F	3	F
3	4	Q	4	Q	4	Q	4	Q	4	Q
4	5	P	5	P	5	P	5	P	5	P
5	6	X	6	X	6	X	6	X	6	X
6	7	C	7	C	7	C	7	C	7	C
7	8	F	8	F	8	F	8	F	8	F
8	9	Q	9	Q	9	Q	9	Q	9	Q
9	A	P	A	P	A	P	A	P	A	P
10	D	X	D	X	D	X	D	X	D	X
11	J	C	J	C	J	C	J	C	J	C
12	Q	F	Q	F	Q	F	Q	F	Q	F
13	K	Q	K	Q	K	Q	K	Q	K	Q
14	0	P	0	P	0	P	0	P	0	P
 */
	@Test
	public void testAnalyzeHand1() {
		String s[]= {"2C","2C","2C","2C","2C"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: duplicates"));
	}
	@Test
	public void testAnalyzeHand2() {
		String s[]= {"3F","3F","3F","3F","3F"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: duplicates"));
	}
	@Test
	public void testAnalyzeHand3() {
		String s[]= {"4Q","4Q","4Q","4Q","4Q"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: duplicates"));
	}
	@Test
	public void testAnalyzeHand4() {
		String s[]= {"5P","5P","5P","5P","5P"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: duplicates"));
	}
	@Test
	public void testAnalyzeHand5() {
		String s[]= {"6X","6X","6X","6X","6X"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: duplicates"));
	}
	@Test
	public void testAnalyzeHand6() {
		String s[]= {"7C","7C","7C","7C","7C"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: duplicates"));
	}
	@Test
	public void testAnalyzeHand7() {
		String s[]= {"8F","8F","8F","8F","8F"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: duplicates"));
	}
	@Test
	public void testAnalyzeHand8() {
		String s[]= {"9Q","9Q","9Q","9Q","9Q"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: duplicates"));
	}
	@Test
	public void testAnalyzeHand9() {
		String s[]= {"AP","AP","AP","AP","AP"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: duplicates"));
	}
	@Test
	public void testAnalyzeHand10() {
		String s[]= {"DX","DX","DX","DX","DX"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: duplicates"));
	}
	@Test
	public void testAnalyzeHand11() {
		String s[]= {"JC","JC","JC","JC","JC"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: duplicates"));
	}
	@Test
	public void testAnalyzeHand12() {
		String s[]= {"QF","QF","QF","QF","QF"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: duplicates"));
	}
	@Test
	public void testAnalyzeHand13() {
		String s[]= {"KQ","KQ","KQ","KQ","KQ"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: duplicates"));
	}
	@Test
	public void testAnalyzeHand14() {
		String s[]= {"0P","0P","0P","0P","0P"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: duplicates"));
	}
}

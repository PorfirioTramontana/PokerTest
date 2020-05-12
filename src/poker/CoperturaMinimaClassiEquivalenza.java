package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoperturaMinimaClassiEquivalenza {

	/*
	 Copertura minima delle classi di equivalenza												
	Carta1		Carta2		Carta3		Carta4		Carta5			
Test	Numero	Seme	Numero	Seme	Numero	Seme	Numero	Seme	Numero	Seme	Risultato atteso	Risultato ottenuto
1	2	C	2	F	2	Q	K	F	2	P	four-of-a-kind	four-of-a-kind
2	0	X	0	X	0	X	0	X	0	X	invalid hand: duplicates	invalid hand: duplicates
	 */
	
	@Test
	public void testAnalyzeHand1() {
		String s[]= {"2C","2F","2Q","KF","2P"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("four-of-a-kind"));
	}
	@Test
	public void testAnalyzeHand2() {
		String s[]= {"0X","0X","0X","0X","0X"};
		String res=PokerHandAnalyzer.analyzeHand(s).toString();
		assertTrue("Output ottenuto : "+res,res.contains("invalid hand: duplicates"));
	}

}

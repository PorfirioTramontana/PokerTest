package poker;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
 
public class PokerHandAnalyzer {
 
    final static String faces = "AKQJD98765432";
    final static String suits = "CQFP";
 
    public static Score analyzeHand(final String[] hand) {
    	if (hand==null) return new Score("empty hand", -1, hand);
        if (hand.length != 5)
            return new Score("invalid hand: wrong number of cards", -1, hand);
 
        if (new HashSet<>(Arrays.asList(hand)).size() != hand.length)
            return new Score("invalid hand: duplicates", -1, hand);
 
        int[] faceCount = new int[faces.length()];
        long straight = 0, flush = 0;
        for (String card : hand) {
 
            int face = faces.indexOf(card.charAt(0));
            if (face == -1)
                return new Score("invalid hand: non existing face", -1, hand);
            straight |= (1 << face);
 
            faceCount[face]++;
 
            if (suits.indexOf(card.charAt(1)) == -1)
                return new Score("invalid hand: non-existing suit", -1, hand);
            flush |= (1 << card.charAt(1));
        }
 
        // shift the bit pattern to the right as far as possible
        while (straight % 2 == 0)
            straight >>= 1;
 
        // straight is 00011111; A-2-3-4-5 is 1111000000001
        boolean hasStraight = straight == 0b11111 || straight == 0b1111000000001;
 
        // unsets right-most 1-bit, which may be the only one set
        boolean hasFlush = (flush & (flush - 1)) == 0;
 
        if (hasStraight && hasFlush)
            return new Score("straight-flush", 9, hand);
 
        int total = 0;
        for (int count : faceCount) {
            if (count == 4)
                return new Score("four-of-a-kind", 8, hand);
            if (count == 3)
                total += 3;
            else if (count == 2)
                total += 2;
        }
 
        if (total == 5)
            return new Score("full-house", 7, hand);
 
        if (hasFlush)
            return new Score("flush", 6, hand);
 
        if (hasStraight)
            return new Score("straight", 5, hand);
 
        if (total == 3)
            return new Score("three-of-a-kind", 4, hand);
 
        if (total == 4)
            return new Score("two-pair", 3, hand);
 
        if (total == 2)
            return new Score("one-pair", 2, hand);
 
        return new Score("high-card", 1, hand);
    }
 

    static class Score {
        final int weight;
        final String name;
        final String[] hand;
 
        Score(String n, int w, String[] h) {
            weight = w;
            name = n;
            hand = h != null ? h.clone() : h;
        }
 
        @Override
        public String toString() {
            return Arrays.toString(hand) + " " + name;
        }
    }

}
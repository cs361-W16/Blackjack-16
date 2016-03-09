package models;

import org.junit.Test;

import static org.junit.Assert.*;


public class testDeck{
        @Test
        public void testbuildDeck(){
            Deck d = new Deck();
            assertNotNull(d);
            assertEquals(52, d.cards.size());
        }

        @Test
        public void testshuffle(){
            Deck d = new Deck();
            d.shuffle();
            assertNotEquals(1,d.cards.get(0).getValue());
        }

        @Test
        public void testgetCard(){
            Deck d = new Deck();
            assertEquals(1,d.getCardinDeck(0).getValue());
        }

        @Test
        public void testDealCard(){
            Deck d = new Deck();
            d.dealCard();
            assertEquals(51, d.cards.size());
        }

}

package models;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class testDeck{


    private static Deck d;
  //  private boolean deckInit = false;
  //  private int makeDeckOnce = 1;

    @BeforeClass
    public static void setUp() throws Exception {
       // if(!deckInit) {
            d = new Deck();
            System.out.println("" + d.cards.size());
    }

    @Test
        public void testbuildDeck(){
            Deck d2 = new Deck();
            assertNotNull(d2);
            assertEquals(52, d2.cards.size());
        }

        @Test
        public void testshuffle(){
            Deck d3 = new Deck();
            d3.shuffle();
            assertNotEquals(1,d3.cards.get(0).getValue());
        }

        @Test
        public void testgetCard(){
            Deck d4 = new Deck();
            assertEquals(1,d4.getCardinDeck(0).getValue());
        }

        @Test
        public void testDealCard(){
            Deck d5 = new Deck();
            d5.dealCard();
            assertEquals(51, d5.cards.size());
        }

}

package models;

import org.junit.Test;

import static models.Hand.*;
import static org.junit.Assert.*;

public class testHand{

    @Test
    public void testBuildHand(){
        Hand h = new Hand();
        assertNotNull(h);
    }

    @Test
    public void testaddCard(){
        Card c = new Card("Spades", "7", 7);
        Hand h = new Hand();
        Hand.addCard(c);
        assertEquals(c,h.cards.get(0));
    }

    @Test
    public void testBlackJack(){
        Card c = new Card("Diamonds","10", 10);
        Card c1 = new Card("Spades", "6", 6);
        Card c2 = new Card("Hearts","5", 5);
        Hand h = new Hand();
        Hand.addCard(c);
        Hand.addCard(c1);
        Hand.addCard(c2);
        assertEquals(true,h.isBlackjack());
    }

    @Test
    public void testnotBlackJack(){
        Card cc = new Card("Diamonds","10", 10);
        Card cc1 = new Card("Spades", "6", 6);
        Hand hh = new Hand();
        Hand.addCard(cc);
        Hand.addCard(cc1);
        assertEquals(false,hh.isBlackjack());
    }

    @Test
    public void testBust(){
        Card c = new Card("Diamonds","10", 10);
        Card c1 = new Card("Spades", "6", 6);
        Card c2 = new Card("Hearts","8", 8);
        Hand h = new Hand();
        Hand.addCard(c);
        Hand.addCard(c1);
        Hand.addCard(c2);
        assertEquals(true,h.isBust());
    }

    @Test
    public void testnotBust(){
        Card c = new Card("Diamonds","10", 10);
        Card c1 = new Card("Spades", "6", 6);
        Card c2 = new Card("Hearts","3", 3);
        Hand h = new Hand();
        Hand.addCard(c);
        Hand.addCard(c1);
        Hand.addCard(c2);
        assertEquals(false,h.isBust());
    }
}


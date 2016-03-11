package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class testPlayer{
    @Test
    public void testMakePlayer(){
        Player p = new Player();
        assertNotNull(p);
    }

    @Test
    public void testhasHand(){
        Player p = new Player();
        assertNotNull(p.hand);
    }

    @Test
    public void testHit(){
        Player p = new Player();
        Deck d = new Deck();
        d.shuffle();
        Card c = d.dealCard();
        int dealtValue = c.getValue();
        p.hit(c);
        assertEquals(dealtValue,p.hand.cards.get(0).getValue());
    }

    @Test
    public void testStand(){
        Player p = new Player();
        p.stand();
        assertNotNull(p);
    }
}

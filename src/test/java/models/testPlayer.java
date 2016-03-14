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
        Game g = new Game();
        g.cruz.hit(g.d.cards.get(1));

        assertEquals(2,g.cruz.handLeft.cards.size());
    }

    @Test
    public void testStand(){
        Player p = new Player();
        p.stand();
        assertNotNull(p);
    }
}
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
        //Hand h = new Hand();
        assertNotNull(p.hand);
    }
}

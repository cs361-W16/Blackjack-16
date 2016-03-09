package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class testCard {

    @Test
    public void testBuildCard(){
        Card c = new Card("Clubs", "5", 5);
        assertNotNull(c);
    }

    @Test
    public void testgetSuit(){
        Card c = new Card("Clubs", "5", 5);
        assertEquals("Clubs",c.getSuit());
    }

    @Test
    public void testgetRank(){
        Card c = new Card("Clubs", "5", 5);
        assertEquals("5",c.getRank());
    }

    @Test
    public void testgetValue(){
        Card c = new Card("Clubs", "5", 5);
        assertEquals(5,c.getValue());
    }

}


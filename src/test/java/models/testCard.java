package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class testCard {

    @Test
    public void testBuildCard(){
        Card c = new Card("Clubs", "5", 5);
        assertNotNull(c);
    }

}


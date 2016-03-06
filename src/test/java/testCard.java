package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michaelhilton on 1/25/16.
 */
public class testCard {

    @Test
    public void testBuildCard(){
        Card c = new Card("Clubs", "5");
        assertNotNull(c);
    }

}

package models;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by natalie school on 3/9/2016.
 */
public class TestAce{
    @Test
    public void testAce(){
        Ace a = new Ace("Hearts","1",1);
        assertEquals(1,a.getValue());
    }

    @Test
    public void testSetValue(){
        Ace a = new Ace("Hearts","1",1);
        a.setValue(11);
        assertEquals(11,a.getValue());
    }
}

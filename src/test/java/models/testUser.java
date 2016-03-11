package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by alecno20 on 3/10/2016.
 */
public class testUser {


    @Test
    public void testUser(){
        User u = new User(10,"george");
        assertNotNull(u);
        assertEquals(u.bank, 10);
        assertEquals(u.name,"george");
    }
    @Test
    public void testBet(){
        User u = new User(10,"george");
        assertNotNull(u);
        assertEquals(u.bank, 10);
        u.Bet(1);
        assertEquals(u.bank, 9);
    }
    @Test
    public void testDoubleDown(){
        User u = new User(10,"george");
        assertNotNull(u);
        assertEquals(u.bank, 10);
        u.Bet(1);
        assertEquals(u.bank, 9);
        u.DoubleDown();
        assertEquals(u.bank, 8);
    }


}

package models;

import org.junit.Test;
import models.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by alecno20 on 3/10/2016.
 */
public class testUser {


    @Test
    public void testUser(){
        Game newGame = new Game();
        newGame.cruz = new User();
        assertNotNull(newGame.cruz);
        assertEquals(newGame.cruz.bank, 100);

    }
    @Test
    public void testBet(){
        Game newGame = new Game();
        assertNotNull(newGame.cruz);
        assertEquals(newGame.cruz.bank, 100);

    }
    @Test
    public void testDoubleDown(){
        Game newGame = new Game();
        newGame.cruz = new User();
        assertNotNull(newGame.cruz);
        assertEquals(newGame.cruz.bank, 100);

    }


}
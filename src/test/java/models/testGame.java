package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by alecno20 on 3/10/2016.
 */
public class testGame {


    @Test
    public void testGame(){
        Game g =new Game();
        assertNotNull(g);
    }

    @Test
    public void testStartGame(){
        Game g =new Game();

        assertEquals(g.cruz.bank,100);

    }

}
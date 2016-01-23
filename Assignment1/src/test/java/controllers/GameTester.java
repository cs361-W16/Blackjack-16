package controllers;


import models.Deck;
import ninja.NinjaDocTester;
import org.doctester.testbrowser.TestBrowser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by alecno20 on 1/22/2016.
 */
public class GameTester extends NinjaDocTester {

    @Test
    public void testDeckValue(){
        models.Game activeGame = new models.Game();
        assertEquals(activeGame.isOver, false);
    }
}

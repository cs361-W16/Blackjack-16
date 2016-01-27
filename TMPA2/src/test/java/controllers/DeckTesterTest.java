package controllers;


import models.Deck;
import org.apache.commons.lang.ObjectUtils;
import org.junit.Test;
import java.util.*;
import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.hamcrest.CoreMatchers;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

/**
 * Created by Neil on 1/22/2016.
 */
public class DeckTesterTest extends NinjaDocTester {


    @Test
    public void testDeckExists(){
        Deck activeDeck = new Deck();
        assertNotNull(activeDeck);
    }

    @Test
    public void testDeckValue(){
        Deck activeDeck = new Deck();
        activeDeck.initDeck();
        assertEquals(activeDeck.getActiveDeckSize(), 52);
    }

    @Test
    public void testDeckProperties(){
        Deck activeDeck = new Deck();
        activeDeck.initDeck();
        assertEquals(activeDeck.getDisplayVal(0), "2");
        assertEquals(activeDeck.getCardSuit(0), "S");
        assertEquals(activeDeck.getRealVal(0), 2);
        assertEquals(activeDeck.getDisplayVal(1), "2");
        assertEquals(activeDeck.getCardSuit(1), "C");
        assertEquals(activeDeck.getRealVal(1), 2);
        assertEquals(activeDeck.getDisplayVal(4), "3");
        assertEquals(activeDeck.getCardSuit(4), "S");
        assertEquals(activeDeck.getRealVal(4), 3);
    }

    @Test
    public void testDeckRemove(){
        Deck activeDeck = new Deck();
        activeDeck.initDeck();
        activeDeck.remove(51);
        assertEquals(activeDeck.getActiveDeckSize(), 51);
        activeDeck.remove(45);
        assertEquals(activeDeck.getActiveDeckSize(), 50);
    }

    @Test
    public void testIsEmpty(){
        Deck activeDeck = new Deck();
        activeDeck.initDeck();
        assertEquals(activeDeck.getActiveDeckSize(), 52);
        assertEquals(activeDeck.getIsEmpty(), false);
        for(int i =  activeDeck.getActiveDeckSize() - 1; i >= 0; i--){
            activeDeck.remove(i);
        }
        assertEquals(activeDeck.getActiveDeckSize(), 0);
        assertEquals(activeDeck.getIsEmpty(), true);
    }


    @Test
    public void testGetIsEmpty() throws Exception {

    }

    @Test
    public void testGetActiveDeckSize() throws Exception {

    }

    @Test
    public void testGetCardSuit() throws Exception {

    }

    @Test
    public void testGetDisplayVal() throws Exception {

    }

    @Test
    public void testGetRealVal() throws Exception {

    }

    @Test
    public void testInitDeck() throws Exception {

    }

    @Test
    public void testRemove() throws Exception {

    }

    @Test
    public void testDealCards() throws Exception {

    }

    @Test
    public void testCheckIfEmpty() throws Exception {

    }
}

package models;

/**
 * Created by alecno20 on 1/22/2016.
 */
public class Game {
    public boolean isOver;
    public Game() {
    isOver=false;
    }
    public Game(Deck activeDeck){
        isOver=activeDeck.isEmpty;
    }
}

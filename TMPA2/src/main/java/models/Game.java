package models;

/**
 * Created by alecno20 on 1/22/2016.
 */
public class Game {
    public boolean isOver;
    public String[][] board = new String[12][4];
    public Game() {
        isOver=false;
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 12; j++){
                board[j][i] = "";
            }
        }

    }
    public Game(Deck activeDeck){
        isOver=activeDeck.isEmpty;
    }

}

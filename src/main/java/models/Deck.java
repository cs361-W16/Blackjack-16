package models;

import com.fasterxml.jackson.annotation.*;
import java.util.*;
import java.io.Serializable;

public class Deck{
    public Card cardinDeck;
    public ArrayList<Card> cards = new ArrayList();

    Deck() {
        for(int i = 1; i < 11; i++){
          if(i == 1){
            cards.add(new Card("Clubs","Ace",11));
            cards.add(new Card("Hearts","Ace",11));
            cards.add(new Card("Diamonds","Ace",11));
            cards.add(new Card("Spades","Ace",11));
          }
            else{
            cards.add(new Card("Clubs",String.valueOf(i),i));
            cards.add(new Card("Hearts",String.valueOf(i),i));
            cards.add(new Card("Diamonds",String.valueOf(i),i));
            cards.add(new Card("Spades",String.valueOf(i),i));
          }
        }
        for(int i = 11; i < 14; i++){
            cards.add(new Card("Clubs",String.valueOf(i),10));
            cards.add(new Card("Hearts",String.valueOf(i),10));
            cards.add(new Card("Diamonds",String.valueOf(i),10));
            cards.add(new Card("Spades",String.valueOf(i),10));
        }
    }

    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(cards, new Random(seed));
    }

    public Card getCardinDeck(){
        Card dealtCard = cards.get(0);
        cards.remove(0);
        return dealtCard;
    }

}

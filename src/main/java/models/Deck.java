package models;
import java.util.*;

public class Deck{

    public ArrayList<Card> cards = new ArrayList();

    Deck() {
        for(int i = 1; i < 11; i++){
            cards.add(new Card("Clubs",String.valueOf(i),i));
            cards.add(new Card("Hearts",String.valueOf(i),i));
            cards.add(new Card("Diamonds",String.valueOf(i),i));
            cards.add(new Card("Spades",String.valueOf(i),i));
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

    public Card getCardinDeck(int i){
        return cards.get(i);
    }

    public Card dealCard(){
        return cards.remove(0);
    }


}
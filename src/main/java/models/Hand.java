package models;
import java.util.*;

public class Hand{
    public int count;
    public ArrayList<Card> cards = new ArrayList();

    Hand(){
        count = 0;
    }

    public void addCard(Card c) {
        cards.add(c);
        count += c.value;
    }

    public boolean isBlackjack() {
        if(count == 21){
            return true;
        }
        return false;
    }

    public boolean isBust() {
        if(count > 21){
            return true;
        }
        return false;
    }
}
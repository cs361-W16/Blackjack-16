package models;

import java.util.*;
import models.Card;
import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;

public class Hand {
    public int count;
    public boolean blackjack=false;
    public boolean bust=false;
    public ArrayList<Card> cards = new ArrayList();

    public Hand(){
        count = 0;
    }

    public void addCard(Card c) {
        cards.add(c);
        count += c.value;
    }

    public void removeCard(Card c){
        cards.remove(c);
        count -= c.value;
    }

    public boolean isBlackjack() {
        if(count == 21 && cards.size() == 2){
            this.blackjack=true;
            return true;
        }
        this.blackjack=false;
        return false;
    }

    public Card getCard(int position){
        return this.cards.get(position);
    }

    public boolean isBust() {
        if(count > 21){
            this.bust =true;
            return true;
        }
        this.bust=false;
        return false;
    }
}

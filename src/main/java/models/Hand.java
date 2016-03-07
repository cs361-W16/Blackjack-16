package models;
import java.util.*;

public class Hand{
    public static int count;
    public static ArrayList<Card> cards = new ArrayList();

    Hand(){
        count = 0;
    }

    public static void addCard(Card c) {
        cards.add(c);
        count += c.value;
    }

    public static boolean isBlackjack() {
        if(count == 21){
            return true;
        }
        return false;
    }

    public static boolean isBust() {
        if(count > 21){
            return true;
        }
        return false;
    }
}
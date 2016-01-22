package models;
import java.util.*;
/**
 * Created by Neil on 1/21/2016.
 */
public class Deck{

    //Deck class is comprised of array of Card objects. Also includes a second array that contains cards to be dealt

    String[] cardDisplay = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    String[] suits = {"S", "C", "H", "D"};
    int[] value = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    Card[] currentDeck = new Card[52];  //create 52 blank cards for deck
    Card[] toDeal = new Card[4];        //create an array of blank cards as placeholders for the ones to be dealt
    int activeDeckSize;
    boolean isEmpty;

    //getter functions, used to return object data
    public boolean getIsEmpty(){
        return isEmpty;
    }

    public int getActiveDeckSize(){
        return activeDeckSize;
    }

    public String getCardSuit(int position){
        return currentDeck[position].getSuit();
    }

    public String getDisplayVal(int position){
        return currentDeck[position].getDisplayVal();
    }

    public int getRealVal(int position){
        return currentDeck[position].getRealValue();
    }

    //initialize the currentDecks cards. 4 suits for each string value (2-A) and a point value for each card to use for direct comparison

    public void initDeck(){
        int cardNum = 0;
        for(int i = 0; i< cardDisplay.length; i++){
            for(int j = 0; j < suits.length; j++){
                currentDeck[cardNum] = new Card();
                currentDeck[cardNum].makeCard(cardDisplay[i], suits[j], value[i]);
                cardNum++;
            }
        }
        activeDeckSize = currentDeck.length;
        isEmpty =false;
    }


    //shifts all cards beyond the given position over one space (overwriting the card to be removed), sets card at end of array to Null, shrinks active deck size (no array resizing)

    public void remove(int position){

        for(int i = position; i < currentDeck.length - 1; i++){
            currentDeck[i] = currentDeck[i+1];
        }
        currentDeck[currentDeck.length - 1] = null;
        activeDeckSize--;
        checkIfEmpty();
    }

    //For each card to be dealt, generate random number between 0 and activeDeckSize. At that position in the currentDeck, set all properties of the card to be dealt equal to the
    //card in the current deck, remove the card from the current deck;

    public void dealCards(){
        int randNum = 0;

        for(int i = 0; i < toDeal.length; i++){
            randNum = (int)(activeDeckSize * Math.random()) + 1;
            toDeal[i].displayVal = currentDeck[randNum].displayVal;
            toDeal[i].suit = currentDeck[randNum].suit;
            toDeal[i].realValue = currentDeck[randNum].realValue;
            remove(randNum);
        }
    }

    public void checkIfEmpty(){
        if(activeDeckSize == 0)
            isEmpty = true;
    }
}


class Card extends Deck{
    String displayVal;
    String suit;
    int realValue;

    public void makeCard(String displayVal, String suit, int realValue){
        this.displayVal = displayVal;
        this.suit = suit;
        this.realValue = realValue;
    }

    public String getDisplayVal(){
        return displayVal;
    }

    public String getSuit(){
        return suit;
    }

    public int getRealValue(){
        return realValue;
    }

}
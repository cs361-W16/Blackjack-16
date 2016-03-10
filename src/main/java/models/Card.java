package models;

public class Card{
    public String suit;
    public String rank;
    public int value;

    Card(String s, String r, int v) {
        suit = s;
        rank = r;
        value = v;
    }

    public String getSuit(){
        return suit;
    }

    public String getRank(){
        return rank;
    }

    public int getValue(){ return value; }

    public void setValue(int aceValue){
        value = aceValue;
    }
}
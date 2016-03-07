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
}
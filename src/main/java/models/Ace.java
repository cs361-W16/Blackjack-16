package models;

public class Ace extends Card{
    Ace(String s, String r, int v) {
        super(s, r, v);
    }

    public void setValue(int aceValue){
        value = aceValue;
    }
}
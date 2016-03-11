package models;

public class User extends Player{

    public String name;
    public int bank;
    public int lastbet;

    public User(int b, String s){
        bank=b;
        name=s;
    }

    public void Bet(int bet){
        bank=bank-bet;
        lastbet=bet;
    }

    public void DoubleDown() {
        bank=bank-lastbet;
    }

}
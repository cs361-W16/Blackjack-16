package models;

public class Game{
//deal removes top card and adds to hand
    public static User u;
    public static Dealer d;

    public void start(String name, int money){
        User u = new User(money, name);
        Dealer d = new Dealer();
    }

    public void playRound(int bet){
        u.Bet(bet);
    }

}
package models;

public class Player {
    public Hand hand = new Hand();

    public void hit(Card c) {
        hand.addCard(c);
    }

    public void stand() {
    }

}
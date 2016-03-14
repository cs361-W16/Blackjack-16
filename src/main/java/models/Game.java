package models;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;


public class Game implements Serializable {
    public User cruz;
    public Dealer jeb;
    public Deck d;
    public int pot;

    public Game() {
     this.cruz = new User();
     this.jeb = new Dealer();
     this.d = new Deck();
     this.pot = 0;
     this.d.shuffle();
     this.cruz.handLeft.addCard(this.d.getCardinDeck());
     this.cruz.handLeft.addCard(this.d.getCardinDeck());

     this.jeb.hand.addCard(this.d.getCardinDeck());
     this.jeb.hand.addCard(this.d.getCardinDeck());
    }

}

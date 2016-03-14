package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.*;
import models.*;

import java.io.Serializable;

public class Player {
    public Hand hand = new Hand();



    public void hit(Card c) {
        this.hand.addCard(c);
    }

    public void stand() {
    }



}

package models;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;

public class Dealer extends Player{
	public Hand dealerHand;



	public Dealer() {
		this.dealerHand = new Hand();
	}
}

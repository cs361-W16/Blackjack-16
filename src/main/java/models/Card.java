package models;

import com.fasterxml.jackson.annotation.*;


import java.io.Serializable;

public class Card {

  public String suit;
  public String rank;
  public int value;

  @JsonCreator
  Card(@JsonProperty("suit") String s, @JsonProperty("rank") String r, @JsonProperty("value") int v) {
      this.suit = s;
      this.rank = r;
      this.value = v;
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

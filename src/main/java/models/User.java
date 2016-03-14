package models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.*;
import models.*;
import java.io.Serializable;

public class User extends Player{

    public String name;
    public int bank;
    public int lastbet;
    public Hand handLeft;
    public Hand handRight;


    public User(){
        this.bank = 100;
        this.name = "default";
        this.lastbet = 0;
        this.handLeft = new Hand();
        this.handRight = new Hand();
    }

    public void winsPot(int pot){
      this.bank = this.bank + pot;
    }

}

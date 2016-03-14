package models;
import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;

public class Ace extends Card{
    Ace(@JsonProperty("suit") String s, @JsonProperty("rank") String r, @JsonProperty("value") int v) {
        super(s, r, v);
    }

    public void setValue(int aceValue){
        value = aceValue;
    }
}

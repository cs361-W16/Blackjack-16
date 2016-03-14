package models;
import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;

public class Face extends Card {
  @JsonCreator
    Face(@JsonProperty("suit") String s, @JsonProperty("rank") String r, @JsonProperty("value") int v) {
        super(s, r, v);
    }

}

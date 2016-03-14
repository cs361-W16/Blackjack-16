/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package controllers;

import models.*;
import ninja.Context;
import ninja.Result;
import ninja.Results;

import com.google.inject.Singleton;
import ninja.params.PathParam;



public class DealerController extends ApplicationController {

    public Result index() {
        return Results.html();
    }

    public Result hit(Context context, Game g){

      if((g.jeb.hand.count + 11) < 21){  
        while(g.jeb.hand.count < 17){
          g.jeb.hit(g.d.getCardinDeck());
          g.jeb.hand.isBlackjack();
          g.jeb.hand.isBust();
      }
  }
      else{
        for (int i = 0; i < g.jeb.hand.cards.size(); i++){
            if( g.jeb.hand.cards.get(i).rank == "Ace"){
                g.jeb.hand.cards.get(i).setValue(1);
            }
        }
        while(g.jeb.hand.count < 17){
          g.jeb.hit(g.d.getCardinDeck());
          g.jeb.hand.isBlackjack();
          g.jeb.hand.isBust();
      }

  }
       // remove card
  return Results.json().render(g);

}

public Result stay(){
    return Results.html();

}
    // public Result index() {
    //     return Results.html();
    // }

    // public Result acesUp() {
    //     return Results.html().template("views/AcesUp/AcesUp.flt.html");
    // }

    // public Result regionSelect() {
    //     return Results.html().template("views/AcesUp/regionSelect.html");
    // }

    // public Result externalJs() {
    //     return Results.html().template("controllers/javascript/externalJs.js");
    // }

    // public Result gameGet(Context context){
    //     Game g = new Game();


    //     if(context.getRequestPath().contains("spanish")){
    //         g.buildSpanishDeck();
    //     }
    //     else{
    //         g.buildDeck();
    //     }
    //     g.shuffle();
    //     g.dealFour();

    //     return Results.json().render(g);
    // }

    // public Result dealPost(Context context, Game g) {
    //     if(context.getRequestPath().contains("deal")){
    //         g.dealFour();
    //     }
    //     return Results.json().render(g);
    // }

    // public Result removeCard(Context context, @PathParam("column") int colNumber, Game g){
    //     g.remove(colNumber);
    //     return  Results.json().render(g);
    // }

    // public Result moveCard(Context context, @PathParam("columnFrom") int colFrom, @PathParam("columnTo") int colTo, Game g){
    //     g.move(colFrom,colTo);
    //     return  Results.json().render(g);
    // }

}

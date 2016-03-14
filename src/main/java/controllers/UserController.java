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
import models.Game;
import ninja.Context;
import ninja.Result;
import ninja.template.*;
import ninja.Results;

import com.google.inject.Singleton;
import ninja.params.PathParam;




public class UserController {

    public Result index() {
        return Results.html();
    }


    public Result hitLeft(Context context, Game g){

       g.cruz.handLeft.addCard(g.d.getCardinDeck());
       g.cruz.handLeft.isBlackjack();
       g.cruz.handLeft.isBust();
       // remove card
       return Results.json().render(g);

    }

    public Result hitRight(Context context, Game g){

       g.cruz.handRight.addCard(g.d.getCardinDeck());
       // remove card
       return Results.json().render(g);
    }

    public Result doubleDown(Context context, Game g){
       g.cruz.bank -=2;
       g.pot+=2;
        
       return Results.json().render(g);
    }

    public Result split(Context context, Game g) {
        g.pot+=2;
        g.cruz.bank -=2;
        g.cruz.handRight.cards.add(g.cruz.handLeft.cards.get(1));
        g.cruz.handLeft.count -= g.cruz.handLeft.cards.get(1).value;
        g.cruz.handRight.count += g.cruz.handLeft.cards.get(1).value;
        g.cruz.handLeft.cards.remove(1);
        return Results.json().render(g);
    }

    public Result userBlackjack(Context context, Game g){
        g.cruz.handRight.isBlackjack();
        return Results.json().render(g);
    }

    public Result userBust(Context context, Game g){
        g.cruz.handRight.isBust();
        return Results.json().render(g);
    }


    public Result updateBank(Context context, Game g){
            g.cruz.winsPot(g.pot);
            g.pot = 0;
            return Results.json().render(g);
}
    public Result updateBankHalf(Context context, Game g){
        
            g.cruz.winsPot(g.pot/3);
            g.pot = 0;
            return Results.json().render(g);
          }

}

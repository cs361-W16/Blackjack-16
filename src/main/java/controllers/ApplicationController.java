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


@Singleton
public class ApplicationController {

    public Result index(Context context) {
        Game g = new Game();
        // TemplateEngine.invoke(context, Results.html().template("views/layout/BlackJack.ftl.html"));
        // loadTemplate("views/layout/BlackJack.ftl.html");
        return Results.html().template("views/layout/BlackJack.ftl.html");
    }



    public Result getData(Context context){
        Game g = new Game();
        g.pot = 4;
        g.cruz.bank -= 2;
        return Results.json().render(g);
    }

    public Result shuffleDeck(Context context, Game g){
        g.d.shuffle();
        return Results.json().render(g);
    }
    
    public Result newcards(Context context, Game g){
        for(int i = 0; i < g.cruz.handLeft.cards.size(); i++ ){
            g.cruz.handLeft.cards.remove(g.cruz.handLeft.cards.get(i));
        }
        for(int i = 0; i < g.jeb.hand.cards.size(); i++ ){
            g.jeb.hand.cards.remove(g.jeb.hand.cards.get(i));
        }
        return Results.json().render(g);
    }


}

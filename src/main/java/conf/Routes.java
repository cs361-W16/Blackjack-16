/**
 * Copyright (C) 2012 the original author or authors.
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

package conf;


import ninja.AssetsController;
import ninja.Router;
import ninja.application.ApplicationRoutes;
import controllers.*;


public class Routes implements ApplicationRoutes {

    @Override
    public void init(Router router) {

        router.GET().route("/").with(ApplicationController.class, "index");
        router.GET().route("/getData").with(ApplicationController.class, "getData");
//        router.GET().route("/hello_world.json").with(ApplicationController.class, "helloWorldJson");
        // router.GET().route("/AcesUp").with(ApplicationController.class, "acesUp");

        // router.GET().route("/game/english").with(ApplicationController.class, "gameGet");
        // router.GET().route("/game/spanish").with(ApplicationController.class, "gameGet");
        // router.POST().route("/dealGame").with(ApplicationController.class, "dealPost");
        // router.POST().route("/moveCard/{columnFrom}/{columnTo}").with(ApplicationController.class, "moveCard");
        // router.POST().route("/removeCard/{column}").with(ApplicationController.class, "removeCard");
        router.GET().route("/BlackJack/").with(ApplicationController.class, "index");

        router.POST().route("/dealer/hit").with(DealerController.class, "hit");
        router.GET().route("/dealer/stay").with(DealerController.class, "stay");
        router.POST().route("/user/hit").with(UserController.class, "hitLeft");
        router.POST().route("/user/hitRight").with(UserController.class, "hitRight");
        router.POST().route("/user/doubleDown").with(UserController.class, "doubleDown");
        router.POST().route("/user/split").with(UserController.class, "split");
        router.POST().route("/user/checkBlackJack").with(UserController.class, "userBlackjack");
        router.POST().route("/user/checkBust").with(UserController.class, "userBust");
        router.POST().route("/user/addPot").with(UserController.class, "updateBank");
        router.POST().route("/user/addHalfPot").with(UserController.class, "updateBankHalf");
        router.POST().route("/shuffleDeck").with(ApplicationController.class, "shuffleDeck");
        router.POST().route("/newCards").with(ApplicationController.class, "newcards");


        // router.GET().route("/user/bet").with(UserController.class, "bet");

        ///////////////////////////////////////////////////////////////////////
        // Assets (pictures / javascript)
        ///////////////////////////////////////////////////////////////////////
        router.GET().route("/assets/webjars/{fileName: .*}").with(AssetsController.class, "serveWebJars");
        router.GET().route("/assets/{fileName: .*}").with(AssetsController.class, "serveStatic");

        ///////////////////////////////////////////////////////////////////////
        // Region Select Route
        ///////////////////////////////////////////////////////////////////////




        ///////////////////////////////////////////////////////////////////////
        // Index / Catchall shows index page
        ///////////////////////////////////////////////////////////////////////
//        router.GET().route("/.*").with(ApplicationController.class, "index");
    }

}

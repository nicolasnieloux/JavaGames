package fr.campusnumerique.cda.games.utils;

import fr.campusnumerique.cda.games.game.GameAbstract;
import fr.campusnumerique.cda.games.game.GameFactory;

public class GameController {
    private View view = View.getInstance();
    private Validator validator = Validator.getInstance();
    private UserInteraction userInteraction = UserInteraction.getInstance();


    public void play() {

        view.showWelcomeMsg();
        String modeChoice = getModeChoice();
        String gameChoice = getGameChoice();
        GameAbstract game = new GameFactory().createGame(gameChoice, modeChoice);

        view.displayCurrentBoard(game.getBoard());
    }

    private String getModeChoice(){

        String modeChoice = "";
        while(!validator.verifyInputUserInt(1,3, modeChoice)){
            view.showAskGameTypeMsg();
            modeChoice = userInteraction.getUserInput();
        }
        return modeChoice;
    }

    private String getGameChoice(){

        String gameChoice = "";
        while(!validator.verifyInputUserInt(1,3, gameChoice)){
            view.showAskGameModeMsg();
            gameChoice = userInteraction.getUserInput();
        }
        return gameChoice;
    }
}

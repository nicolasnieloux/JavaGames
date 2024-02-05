package fr.campusnumerique.cda.games.utils;

import fr.campusnumerique.cda.games.game.GameAbstract;
import fr.campusnumerique.cda.games.game.GameFactory;
import fr.campusnumerique.cda.games.game.TicTacToeGame;

public class GameController {
    private View view;
    private Validator validator;
    private UserInteraction userInteraction;


    public GameController() {
        view = View.getInstance();
        validator = Validator.getInstance();
        userInteraction = UserInteraction.getInstance();
    }

    public void play() {

        view.showWelcomeMsg();
        String modeChoice = getModeChoice();
        String gameChoice = getGameChoice();
        GameAbstract game = new GameFactory().createGame(gameChoice, modeChoice);

        view.displayCurrentBoard(game.getBoard());
        int x = 0;
        int y = 0;
        while (!game.isOver(x, y)) {
            System.out.println("tata");
        }
    }

    private String getModeChoice() {

        String modeChoice = "";
        while (!validator.verifyInputUserInt(1, 3, modeChoice)) {
            view.showAskGameTypeMsg();
            modeChoice = userInteraction.getUserInput();
        }
        return modeChoice;
    }

    private String getGameChoice() {

        String gameChoice = "";
        while (!validator.verifyInputUserInt(1, 3, gameChoice)) {
            view.showAskGameModeMsg();
            gameChoice = userInteraction.getUserInput();
        }
        return gameChoice;
    }
}

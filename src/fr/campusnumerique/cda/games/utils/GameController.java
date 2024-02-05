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
        boolean coordinateXisCorrect = false;
        boolean coordinateYisCorrect = false;
        while (!game.isOver(x, y)) {

            do {
                view.displayCoordonateX();
                String coordinateX = userInteraction.getUserInput();
                coordinateXisCorrect = validator.verifyInputUserInt(1, 3, coordinateX);

                view.displayCoordonateY();
                String coordinateY = userInteraction.getUserInput();
                coordinateYisCorrect = validator.verifyInputUserInt(1, 3, coordinateY);
            } while (!coordinateXisCorrect || !coordinateYisCorrect);
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

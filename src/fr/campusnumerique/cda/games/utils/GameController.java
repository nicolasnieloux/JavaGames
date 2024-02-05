package fr.campusnumerique.cda.games.utils;

import fr.campusnumerique.cda.games.game.GameAbstract;
import fr.campusnumerique.cda.games.game.GameFactory;
import fr.campusnumerique.cda.games.game.TicTacToeGame;
import fr.campusnumerique.cda.games.players.PlayerInterface;

public class GameController {
    private View view;
    private Validator validator;
    private UserInteraction userInteraction;

    private PlayerInterface currentPlayer;

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
        currentPlayer = game.getPlayer1();
        view.displayCurrentBoard(game.getBoard());


        int turns = 0;
        int[] coordinates = new int[2];
        do {
            System.out.println(currentPlayer);
            coordinates = getMoveFromPlayer(game);
            turns++;
            game.getBoard().getCell(coordinates[0], coordinates[1]).occupy(currentPlayer.getSymbol());
            nextPlayer(game);
            view.displayCurrentBoard(game.getBoard());
        } while (!game.isOver(coordinates[0], coordinates[1], turns));
    }

    private int[] getMoveFromPlayer(GameAbstract game) {
        boolean validMove = false;

        int[] coordinates = new int[2];
        while (!validMove) {
            coordinates[1] = getPlayersXCoordinate()-1;
            coordinates[0] = getPlayersYCoordinate()-1;
            validMove = !game.getBoard().getCell(coordinates[0], coordinates[1]).isOccupied();
            System.out.println(validMove);
        }

        return coordinates;

    }

    private int getPlayersXCoordinate() {
        boolean coordinateXisCorrect = false;
        String coordinateX;
        do {
            view.displayCoordonateX();
            coordinateX = userInteraction.getUserInput();
            coordinateXisCorrect = validator.verifyInputUserInt(1, 3, coordinateX);
        } while (!coordinateXisCorrect);
        return Integer.parseInt(coordinateX);
    }

    private int getPlayersYCoordinate() {
        boolean coordinateYisCorrect = false;
        String coordinateY;
        do {
            view.displayCoordonateY();
            coordinateY = userInteraction.getUserInput();
            coordinateYisCorrect = validator.verifyInputUserInt(1, 3, coordinateY);
        } while (!coordinateYisCorrect);
        return Integer.parseInt(coordinateY);
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

    public void nextPlayer(GameAbstract gameAbstract) {
        currentPlayer = (currentPlayer == gameAbstract.getPlayer1()) ? gameAbstract.getPlayer2() : gameAbstract.getPlayer1();
    }
}

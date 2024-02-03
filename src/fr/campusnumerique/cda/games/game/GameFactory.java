package fr.campusnumerique.cda.games.game;

import fr.campusnumerique.cda.games.players.HumanPlayer;

public class GameFactory {
    public GameAbstract createGame(String type, String mode){
        return switch (type) {
            case "1" -> new TicTacToeGame(mode);
            case "2" -> new GomokuGame(mode);
            case "3" -> new Connect4Game(mode);
            default -> throw new IllegalArgumentException("The  name is not correct.");
        };

    };
}

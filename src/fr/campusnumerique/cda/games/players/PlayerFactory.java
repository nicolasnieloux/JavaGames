package fr.campusnumerique.cda.games.players;

import fr.campusnumerique.cda.games.game.Connect4Game;
import fr.campusnumerique.cda.games.game.GomokuGame;
import fr.campusnumerique.cda.games.game.TicTacToeGame;
import fr.campusnumerique.cda.games.symbol.SymbolInterface;

public class PlayerFactory {
    public PlayerInterface createPlayer(String mode, int playerNb, SymbolInterface symbol){
        return switch (mode) {
            case "1" -> new HumanPlayer(symbol);
            case "2" -> (playerNb == 1) ? new HumanPlayer(symbol) : new ArtificialPlayer(symbol);
            case "3" -> new ArtificialPlayer(symbol);
            default -> throw new IllegalArgumentException("The player cannot be created");
        };


    };
}

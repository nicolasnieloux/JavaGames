package fr.campusnumerique.cda.games.players;

import fr.campusnumerique.cda.games.game.Connect4Game;
import fr.campusnumerique.cda.games.game.GomokuGame;
import fr.campusnumerique.cda.games.game.TicTacToeGame;
import fr.campusnumerique.cda.games.symbol.SymbolInterface;

public class PlayerFactory {
    public void createPlayer(String type, String mode, int playerNb){
        switch (mode){
            case "1" : (playerNb == 1) ? new HumanPlayer(SymbolInterface): new HumanPlayer(SymbolInterface);
            case "2" : (playerNb == 1) ? new HumanPlayer(SymbolInterface): new ArtificialPlayer(SymbolInterface);
            case "3" : (playerNb == 1) ? new ArtificialPlayer(SymbolInterface): new ArtificialPlayer(SymbolInterface);
        }

    };
}

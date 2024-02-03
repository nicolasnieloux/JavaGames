package fr.campusnumerique.cda.games.game;

import fr.campusnumerique.cda.games.board.BoardInterface;
import fr.campusnumerique.cda.games.board.TicTacToeBoard;
import fr.campusnumerique.cda.games.players.PlayerFactory;
import fr.campusnumerique.cda.games.players.PlayerInterface;
import fr.campusnumerique.cda.games.symbol.TicTacToeSymbol;

public class TicTacToeGame extends GameAbstract{

    protected TicTacToeGame(String mode){
        board = new TicTacToeBoard(3,3);
        player1 = new PlayerFactory().createPlayer(mode, 1, TicTacToeSymbol.X);
        player2 = new PlayerFactory().createPlayer(mode, 2, TicTacToeSymbol.O);
    }




}

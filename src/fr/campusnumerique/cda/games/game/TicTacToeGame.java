package fr.campusnumerique.cda.games.game;

import fr.campusnumerique.cda.games.board.BoardInterface;
import fr.campusnumerique.cda.games.board.TicTacToeBoard;
import fr.campusnumerique.cda.games.players.PlayerInterface;

public class TicTacToeGame extends GameAbstract{

    protected TicTacToeGame(String mode){
        board = new TicTacToeBoard(3,3);
    }



}

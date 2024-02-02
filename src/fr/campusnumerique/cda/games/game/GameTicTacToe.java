package fr.campusnumerique.cda.games.game;

import fr.campusnumerique.cda.games.board.BoardInterface;
import fr.campusnumerique.cda.games.board.TicTacToeBoard;
import fr.campusnumerique.cda.games.players.PlayerInterface;

public class GameTicTacToe {

    private PlayerInterface[] players = new PlayerInterface[2];
    private PlayerInterface player1;
    private PlayerInterface player2;
    private BoardInterface board;

    private GameTicTacToe(String mode){
        board = new TicTacToeBoard(3,3);
    }



}

package fr.campusnumerique.cda.games.game;

import fr.campusnumerique.cda.games.board.Connect4Board;
import fr.campusnumerique.cda.games.board.GomokuBoard;

public class Connect4Game extends GameAbstract{
    protected Connect4Game(String mode){
        board = new Connect4Board(7,6);
    }
}

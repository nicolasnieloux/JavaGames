package fr.campusnumerique.cda.games.game;

import fr.campusnumerique.cda.games.board.GomokuBoard;
import fr.campusnumerique.cda.games.board.TicTacToeBoard;

public class GomokuGame extends GameAbstract{
    protected GomokuGame(String mode){
        board = new GomokuBoard(15,15);

    }

    @Override
    public boolean isOver(int x, int y) {
        return false;
    }
}

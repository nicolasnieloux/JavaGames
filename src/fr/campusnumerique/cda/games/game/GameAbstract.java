package fr.campusnumerique.cda.games.game;

import fr.campusnumerique.cda.games.board.BoardAbstract;
import fr.campusnumerique.cda.games.board.BoardInterface;
import fr.campusnumerique.cda.games.players.PlayerInterface;

public abstract class GameAbstract {
    protected PlayerInterface player1;
    protected PlayerInterface player2;
    protected BoardAbstract board;

    public PlayerInterface getPlayer1() {
        return player1;
    }

    public PlayerInterface getPlayer2() {
        return player2;
    }

    public BoardAbstract getBoard() {
        return board;
    }

    public abstract boolean isOver(int x, int y, int turns);

}

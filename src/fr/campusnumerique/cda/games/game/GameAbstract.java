package fr.campusnumerique.cda.games.game;

import fr.campusnumerique.cda.games.board.BoardInterface;
import fr.campusnumerique.cda.games.players.PlayerInterface;

public abstract class GameAbstract {
    protected PlayerInterface[] players = new PlayerInterface[2];
    protected PlayerInterface player1;
    protected PlayerInterface player2;
    protected BoardInterface board;

    public PlayerInterface[] getPlayers() {
        return players;
    }

    public BoardInterface getBoard() {
        return board;
    }

}

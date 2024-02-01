package fr.campusnumerique.cda.games.board;

import fr.campusnumerique.cda.games.cell.GomokuCell;
import fr.campusnumerique.cda.games.cell.TicTacToeCell;

public class GomokuBoard extends BoardAbstract {
    public GomokuBoard(int width, int heigth) {
        super(width, heigth);
    }

    private void createBoard() {

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                board[i][j] = new GomokuCell();
            }
        }
    }
}

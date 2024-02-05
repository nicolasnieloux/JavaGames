package fr.campusnumerique.cda.games.board;

import fr.campusnumerique.cda.games.cell.CellInterface;
import fr.campusnumerique.cda.games.cell.GomokuCell;
import fr.campusnumerique.cda.games.cell.TicTacToeCell;
import fr.campusnumerique.cda.games.utils.Coordinate;

public class GomokuBoard extends BoardAbstract {
    public GomokuBoard(int width, int heigth) {
        super(width, heigth);
        createBoard();
    }

    private void createBoard() {
        board = new GomokuCell[width][heigth];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                board[i][j] = new GomokuCell();
            }
        }
    }

    @Override
    public CellInterface getCell(Coordinate coordinate) {
        return null;
    }
}

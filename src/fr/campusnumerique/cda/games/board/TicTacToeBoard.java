package fr.campusnumerique.cda.games.board;

import fr.campusnumerique.cda.games.cell.CellAbstract;
import fr.campusnumerique.cda.games.cell.CellInterface;
import fr.campusnumerique.cda.games.cell.TicTacToeCell;
import fr.campusnumerique.cda.games.utils.Coordinate;

public class TicTacToeBoard extends BoardAbstract {


    public TicTacToeBoard(int width, int heigth) {
        super(width, heigth);
    }

    private void createBoard() {
       // TicTacToeCell board[width] = new TicTacToeCell();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                board[i][j] = new TicTacToeCell();
            }
        }
    }

    @Override
    public CellInterface getCell(Coordinate coordinate) {
        return null;
    }
}

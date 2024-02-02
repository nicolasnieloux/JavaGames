package fr.campusnumerique.cda.games.board;

import fr.campusnumerique.cda.games.cell.CellInterface;
import fr.campusnumerique.cda.games.cell.Connect4Cell;
import fr.campusnumerique.cda.games.cell.TicTacToeCell;
import fr.campusnumerique.cda.games.utils.Coordinate;

public class Connect4Board extends BoardAbstract {
    public Connect4Board(int width, int heigth) {
        super(width, heigth);
    }


    private void createBoard() {

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                board[i][j] = new Connect4Cell();
            }
        }
    }

    @Override
    public CellInterface getCell(Coordinate coordinate) {
        return null;
    }
}

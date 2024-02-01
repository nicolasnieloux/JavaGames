package fr.campusnumerique.cda.games.board;

import fr.campusnumerique.cda.games.cell.CellInterface;
import fr.campusnumerique.cda.games.utils.Coordinate;

public abstract class BoardAbstract implements BoardInterface {
    protected CellInterface[][] board;
    protected int width;
    protected int heigth;

    public BoardAbstract(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public CellInterface getCell(Coordinate coordinate) {
        return board[coordinate.getX()][coordinate.getY()];
    }

}

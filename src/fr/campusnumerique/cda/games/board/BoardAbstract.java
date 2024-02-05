package fr.campusnumerique.cda.games.board;

import fr.campusnumerique.cda.games.cell.CellInterface;

public abstract class BoardAbstract implements BoardInterface {
    protected CellInterface[][] board;
    protected int width;
    protected int heigth;

    public BoardAbstract(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return heigth;
    }

    public CellInterface getCell(int x, int y) {
        return board[x][y];
    }

}

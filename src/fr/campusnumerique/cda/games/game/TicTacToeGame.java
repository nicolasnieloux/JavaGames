package fr.campusnumerique.cda.games.game;

import fr.campusnumerique.cda.games.board.TicTacToeBoard;
import fr.campusnumerique.cda.games.players.PlayerFactory;
import fr.campusnumerique.cda.games.symbol.TicTacToeSymbol;

import java.util.Objects;

public class TicTacToeGame extends GameAbstract {

    private int count = 0;
    private int size;
    private int sizeSide;

    protected TicTacToeGame(String mode, int width, int height) {
        size = width * height;
        sizeSide = width;
        board = new TicTacToeBoard(width, height);
        player1 = new PlayerFactory().createPlayer(mode, 1, TicTacToeSymbol.X);
        player2 = new PlayerFactory().createPlayer(mode, 2, TicTacToeSymbol.O);
    }


    private boolean boardIsFull() {
        return count >= size;
    }

    private boolean hasWinner(int x, int y) {
        System.out.println("verify vertical: " + verifyVertical(x, y));
        System.out.println("verify horizontal: " + verifyHorizontal(x, y));
        System.out.println("verify diagonal: " +verifyDiagonal(x, y));
        return (verifyVertical(x, y) || verifyHorizontal(x, y) || verifyDiagonal(x, y));
    }


    private boolean verifyVertical(int x, int y) {
        String playerRepresentation = board.getCell(x, y).getRepresentation();
        System.out.println("player representation" + playerRepresentation);
        for (int i = 0; i < sizeSide; i++) {
            if (!Objects.equals(board.getCell(i, y).getRepresentation(), playerRepresentation)) {
                return false;
            }
        }
        return true;
    }

    private boolean verifyHorizontal(int x, int y) {

        String playerRepresentation = board.getCell(x, y).getRepresentation();
        for (int i = 0; i < sizeSide; i++) {
            if (board.getCell(x, i).getRepresentation() != playerRepresentation) {
                return false;
            }
        }
        return true;
    }

    private boolean verifyDiagonal(int x, int y) {
        String playerRepresentation = board.getCell(x, y).getRepresentation();
        return (verifyDiagonalLeftRight(playerRepresentation) || verifyDiagonalRightLeft(playerRepresentation));
    }

    private boolean verifyDiagonalLeftRight(String playerRepresentation) {
        for (int i = 0; i < sizeSide; i++) {
            if (!Objects.equals(board.getCell(i, i).getRepresentation(), playerRepresentation)) {
                return false;
            }
        }

        return true;
    }

    private boolean verifyDiagonalRightLeft(String playerRepresentation) {
        int y = sizeSide - 1;
        for (int x = 0; x < sizeSide; x++) {
            if (!Objects.equals(board.getCell(x, y).getRepresentation(), playerRepresentation)) {
                return false;
            }
            y--;
        }
        return true;
    }

    @Override
    public boolean isOver(int x, int y, int turns) {
        if(turns >= (size -1  )){
            return boardIsFull() || hasWinner(x,y);
        }
        return false;
    }
}


package fr.campusnumerique.cda.games.utils;

import fr.campusnumerique.cda.games.board.BoardAbstract;
import fr.campusnumerique.cda.games.cell.TicTacToeCell;

public class View {

    private static View instance;
    private View(){};

    public static View getInstance(){
        if(instance == null){
            instance = new View();
        }
        return instance;
    }
    public void showWelcomeMsg() {
        System.out.println("Welcome to the best place to play");
    }

    public void showAskGameTypeMsg() {
        System.out.println("Please Choose Your Game");
        System.out.println(" 1) Tic Tac Toe ");
        System.out.println(" 2) Gomoku ");
        System.out.println(" 3) Connect 4");
    }

    public void showAskGameModeMsg() {
        System.out.println("Please Choose Your Mode");
        System.out.println(" 1) Human vs Human ");
        System.out.println(" 2) Human vs AI ");
        System.out.println(" 3) AI vs AI ");
    }

    public void displayCurrentBoard(BoardAbstract board) {
        printSeparationLine(board.getWidth());
        for (int i = 0; i < board.getWidth(); i++) {
            for (int j = 0; j < board.getHeight(); j++) {
                System.out.print(board.getCell(i, j).getRepresentation());
            }
            printEndLine();
            printSeparationLine(board.getWidth());
        }
    }

    private void printSeparationLine(int size) {
        for (int i = 0; i < size; i++) {
            //Make it as long as the cell's representation string
            int lengthOfCell = new TicTacToeCell().getRepresentation().length();
            for (int j = 0; j < lengthOfCell; j++) {
                System.out.print("_");
            }
        }
        System.out.println();
    }

    private void printEndLine() {
        System.out.println("|");
    }

}

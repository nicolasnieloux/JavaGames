package fr.campusnumerique.cda.games.symbol;

public enum TicTacToeSymbol implements SymbolInterface {


    DEFAULT(" "),
    X("X"),
    O("O");

    private String representation;

    TicTacToeSymbol(String representation) {
        this.representation = representation;
    }

    @Override
    public String getRepresentation() {
        return this.representation;
    }
}

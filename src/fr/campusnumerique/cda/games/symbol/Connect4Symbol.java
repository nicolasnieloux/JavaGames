package fr.campusnumerique.cda.games.symbol;

public enum Connect4Symbol implements SymbolInterface {

    DEFAULT(" "),
    R("R"),
    Y("Y");

    private String representation;

    Connect4Symbol(String representation) {
        this.representation = representation;
    }

    @Override
    public String getRepresentation() {
        return this.representation;
    }
}

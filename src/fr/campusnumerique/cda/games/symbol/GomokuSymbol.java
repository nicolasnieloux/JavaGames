package fr.campusnumerique.cda.games.symbol;

public enum GomokuSymbol implements SymbolInterface {
    DEFAULT("+"),
    W("W"),
    B("B");

    private String representation;

    GomokuSymbol(String representation) {
        this.representation = representation;
    }

    @Override
    public String getRepresentation() {
        return this.representation;
    }
}

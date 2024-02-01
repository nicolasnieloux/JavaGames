package fr.campusnumerique.cda.games.cell;

import fr.campusnumerique.cda.games.symbol.Connect4Symbol;
import fr.campusnumerique.cda.games.symbol.SymbolInterface;

public class Connect4Cell extends CellAbstract {
    public Connect4Cell() {
        super(Connect4Symbol.DEFAULT);
    }

    @Override
    public String getRepresentation() {
        return ("| " + getSymbol() + " ");
    }

    @Override
    protected SymbolInterface getDefault() {
        return Connect4Symbol.DEFAULT;
    }

}
